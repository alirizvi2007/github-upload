package com.epam.orderitem.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.orderitem.dto.OrderItem;
import com.epam.orderitem.repository.OrderItemRepository;
import com.epam.orderitem.service.OrderItemService;
@Service
public class OrderItmemServiceImpl implements OrderItemService {

	@Autowired
	OrderItemRepository orderItemRepository;
	
	@Override
	public List<OrderItem> getOrders() {
		List<OrderItem> orderItem = new ArrayList<OrderItem>();
		orderItemRepository.findAll().forEach(item -> {
			orderItem.add(item);
		});
		return orderItem;
	}

	@Override
	public void addOrder(OrderItem orderDto) throws Exception {
		orderItemRepository.save(orderDto);
	}

}
