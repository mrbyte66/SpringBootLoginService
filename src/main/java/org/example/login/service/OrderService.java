package org.example.login.service;

import org.example.login.entity.Orders;
import org.example.login.repository.IOrderRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    IOrderRepository orderRepository;

    public List<Orders> getAllOrders(){
        return orderRepository.findAll();
    }

    public List<Orders> getAllOrdersOrderBySaveTime(){
        return orderRepository.findAllOrdersBySaveTime();
    }

    public List<Orders> getPreStatusOrdersOrderBySaveTime(){
        return orderRepository.findPreStatusOrdersOrderBySaveTime();
    }

    public List<Orders> getDoneStatusOrdersOrderBySaveTime(){
        return orderRepository.findDoneStatusOrdersOrderBySaveTime();
    }

    public void delete(@NotNull Orders order){
        orderRepository.deleteById(order.getId());
    }

    public Orders getOrderById(Long id){
        return orderRepository.findById(id).orElse(null);
    }

    public Orders saveOrUpdate(Orders order){
        return orderRepository.save(order);
    }

    public List<Orders> getOrdersByFirmNameAndDoneStatusOrderBySaveTime(String firmName){
        return orderRepository.findOrdersByFirmNameAndDoneStatusOrderBySaveTime(firmName);
        //return null;
    }

    public List<Orders> getOrdersByFirmName(String firmName){
        return orderRepository.findOrdersByFirmName(firmName);
        //return null;
    }
}
