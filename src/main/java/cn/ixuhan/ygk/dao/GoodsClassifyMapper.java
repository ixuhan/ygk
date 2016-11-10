package cn.ixuhan.ygk.dao;

import cn.ixuhan.ygk.model.GoodsClassify;
import cn.ixuhan.ygk.model.GoodsClassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsClassifyMapper {
    int countByExample(GoodsClassifyExample example);

    int deleteByExample(GoodsClassifyExample example);

    int deleteByPrimaryKey(Integer classifyId);

    int insert(GoodsClassify record);

    int insertSelective(GoodsClassify record);

    List<GoodsClassify> selectByExampleWithBLOBs(GoodsClassifyExample example);

    List<GoodsClassify> selectByExample(GoodsClassifyExample example);

    GoodsClassify selectByPrimaryKey(Integer classifyId);

    int updateByExampleSelective(@Param("record") GoodsClassify record, @Param("example") GoodsClassifyExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsClassify record, @Param("example") GoodsClassifyExample example);

    int updateByExample(@Param("record") GoodsClassify record, @Param("example") GoodsClassifyExample example);

    int updateByPrimaryKeySelective(GoodsClassify record);

    int updateByPrimaryKeyWithBLOBs(GoodsClassify record);

    int updateByPrimaryKey(GoodsClassify record);
}