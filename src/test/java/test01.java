import cn.ixuhan.ygk.dao.WechatUserMapper;
import cn.ixuhan.ygk.model.WechatUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with Hank.
 * User: Hank
 * Date: 2016/11/8 0008
 * Time: 18:34
 * Des: 数据库测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"}) //加载配置
public class test01 {
    @Autowired
    private WechatUserMapper wechatUserMapper;

    @Test
    public void insert(){//全插入测试
        WechatUser wechatUser = new WechatUser("6","6","6","6","6","6","6","6","6","6");
        int result = wechatUserMapper.insert(wechatUser);
        System.out.println("result = " + result);
    }

    @Test
    public void insertSelective(){//部分插入测试
        WechatUser wechatUser = new WechatUser();
        wechatUser.setOpenid("7");
        int result = wechatUserMapper.insertSelective(wechatUser);
        System.out.println("result = " + result);
    }

    @Test
    public void selectByPrimaryKey(){//查询by主键
        WechatUser wechatUser = wechatUserMapper.selectByPrimaryKey("1");
        System.out.println("wechatUser = " + wechatUser);
    }

    /*@Test
    public void selectByPrimaryKey(){//查询by主键
        WechatUser wechatUser = wechatUserMapper.selectByExample("1");
        System.out.println("wechatUser = " + wechatUser);
    }*/

}
