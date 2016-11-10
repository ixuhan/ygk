package cn.ixuhan.ygk.dao;

import cn.ixuhan.ygk.model.UserOrders;
import cn.ixuhan.ygk.model.UserOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOrdersMapper {
    int countByExample(UserOrdersExample example);

    int deleteByExample(UserOrdersExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(UserOrders record);

    int insertSelective(UserOrders record);

    List<UserOrders> selectByExample(UserOrdersExample example);

    UserOrders selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") UserOrders record, @Param("example") UserOrdersExample example);

    int updateByExample(@Param("record") UserOrders record, @Param("example") UserOrdersExample example);

    int updateByPrimaryKeySelective(UserOrders record);

    int updateByPrimaryKey(UserOrders record);
}