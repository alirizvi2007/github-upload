package com.epam.orderitem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.epam.orderitem.dto.OrderItem;


public interface OrderItemService {
	
	public List<OrderItem> getOrders();
	
	public void addOrder(OrderItem orderDto) throws Exception;
}