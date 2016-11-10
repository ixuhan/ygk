package cn.ixuhan.ygk.dao;

import cn.ixuhan.ygk.model.WechatUser;
import cn.ixuhan.ygk.model.WechatUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WechatUserMapper {
    int countByExample(WechatUserExample example);

    int deleteByExample(WechatUserExample example);

    int deleteByPrimaryKey(String openid);

    int insert(WechatUser record);

    int insertSelective(WechatUser record);

    List<WechatUser> selectByExample(WechatUserExample example);

    WechatUser selectByPrimaryKey(String openid);

    int updateByExampleSelective(@Param("record") WechatUser record, @Param("example") WechatUserExample example);

    int updateByExample(@Param("record") WechatUser record, @Param("example") WechatUserExample example);

    int updateByPrimaryKeySelective(WechatUser record);

    int updateByPrimaryKey(WechatUser record);
}