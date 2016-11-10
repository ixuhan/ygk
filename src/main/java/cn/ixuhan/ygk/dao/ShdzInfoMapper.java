package cn.ixuhan.ygk.dao;

import cn.ixuhan.ygk.model.ShdzInfo;
import cn.ixuhan.ygk.model.ShdzInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShdzInfoMapper {
    int countByExample(ShdzInfoExample example);

    int deleteByExample(ShdzInfoExample example);

    int deleteByPrimaryKey(Integer infoId);

    int insert(ShdzInfo record);

    int insertSelective(ShdzInfo record);

    List<ShdzInfo> selectByExample(ShdzInfoExample example);

    ShdzInfo selectByPrimaryKey(Integer infoId);

    int updateByExampleSelective(@Param("record") ShdzInfo record, @Param("example") ShdzInfoExample example);

    int updateByExample(@Param("record") ShdzInfo record, @Param("example") ShdzInfoExample example);

    int updateByPrimaryKeySelective(ShdzInfo record);

    int updateByPrimaryKey(ShdzInfo record);
}