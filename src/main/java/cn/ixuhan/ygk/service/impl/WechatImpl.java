package cn.ixuhan.ygk.service.impl;

import cn.ixuhan.ygk.dao.WechatUserMapper;
import cn.ixuhan.ygk.model.WechatUser;
import cn.ixuhan.ygk.service.WechatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with Hank.
 * User: Hank
 * Date: 2016/11/8 0008
 * Time: 19:27
 * Des:
 */

@Component("wechatService")
public class WechatImpl implements WechatService{

    @Autowired
    private WechatUserMapper wechatUserMapper;

    public int insertInto(WechatUser wechatUser){
        return wechatUserMapper.insert(wechatUser);
    }
}
