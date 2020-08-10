package com.epam.orderitem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.orderitem.dto.OrderItem;
import com.epam.orderitem.exception.RecordNotFoundException;
import com.epam.orderitem.service.OrderItemService;


@RestController
@RequestMapping("/orderitem")
@RefreshScope
public class ProductItemController {
	
	
	@Autowired
	OrderItemService orderItemService;
	
	@GetMapping("/getorderitems")
	public ResponseEntity<List<OrderItem>>  getOrderItems()
	{
		if (ObjectUtils.isEmpty(orderItemService.getOrders()))
			throw new RecordNotFoundException("No Record Present");
		return new ResponseEntity<List<OrderItem>>(orderItemService.getOrders(),HttpStatus.OK);
	}
	
	@PostMapping("/addorderitem")
	public ResponseEntity<OrderItem>  saveOrderItem(@RequestBody OrderItem orderItem) throws Exception
	{
		orderItemService.addOrder(orderItem);
		return new ResponseEntity<OrderItem>(orderItem,HttpStatus.OK);
	}

}
