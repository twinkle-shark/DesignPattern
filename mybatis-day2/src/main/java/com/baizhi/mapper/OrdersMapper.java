package com.baizhi.mapper;

import com.baizhi.entity.Orders;

import java.util.List;

public interface OrdersMapper {
    List<Orders> findAllOrdersAndUser();
}
