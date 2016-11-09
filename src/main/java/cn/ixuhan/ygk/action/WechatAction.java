package cn.ixuhan.ygk.action;

import com.google.gson.Gson;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created with Hank.
 * User: Hank
 * Date: 2016/11/9 0009
 * Time: 12:38
 * Des:微信基础action，用于与微信后台通讯
 */
public class WechatAction extends BaseSupport {
    private static String APPID;
    private static String SERCET;

    //初始化获取appid和secret
    static {
        //建立配置容器
        Properties properties = new Properties();
        //读取配置文件
        InputStream inputStream = Object.class.getResourceAsStream("/wechat.properties");
        try {
            //把读取到的配置文件加载到配置容器
            properties.load(inputStream);
            //获取APPID
            APPID = properties.get("wechat.APPID").toString();
            //获取SERCET
            SERCET = properties.get("wechat.SECRET").toString();
        }catch (IOException io){
            System.out.println(io.getMessage());
            System.out.println("cant load wechat.properties");
        }
    }

    /**
     * 微信初始化建立连接
     * @return 返回的网页
     */
    @Action(value = "weChatInit", results = {@Result(name = "success", location = "/index.jsp")})
    public String weChatInit() {
        String code = getRequest().getParameter("code");
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid="+APPID+"&secret="+SERCET+"&code="+code+"&grant_type=authorization_code";
        System.out.println("appid = " + APPID + "sercet = " + SERCET);
        try {
            Document doc = Jsoup.connect(url).get();
            //返回网页内容
            String html = doc.body().toString();
            Gson gson = new Gson();
            Map map = gson.fromJson(html, HashMap.class);
            //解析网页拿到access_token
            String access_token = map.get("access_token").toString();
            String openid = map.get("openid").toString();

            //继续访问
            String url2 = "https://api.weixin.qq.com/sns/userinfo?access_token="+access_token+"&openid="+openid+"&lang=zh_CN";
            doc = Jsoup.connect(url2).get();
            html = doc.body().toString();
            map = gson.fromJson(html, HashMap.class);
            String nickname = map.get("nickname").toString();
            System.out.println("nickname = " + nickname);

        }catch (IOException io){
            System.out.println(io.getMessage());
            System.out.println("cant touch url");
        }

        return SUCCESS;
    }
}
