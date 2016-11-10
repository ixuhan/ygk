package cn.ixuhan.ygk.dao;

import cn.ixuhan.ygk.model.GoodsEntity;
import cn.ixuhan.ygk.model.GoodsEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsEntityMapper {
    int countByExample(GoodsEntityExample example);

    int deleteByExample(GoodsEntityExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(GoodsEntity record);

    int insertSelective(GoodsEntity record);

    List<GoodsEntity> selectByExample(GoodsEntityExample example);

    GoodsEntity selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") GoodsEntity record, @Param("example") GoodsEntityExample example);

    int updateByExample(@Param("record") GoodsEntity record, @Param("example") GoodsEntityExample example);

    int updateByPrimaryKeySelective(GoodsEntity record);

    int updateByPrimaryKey(GoodsEntity record);
}