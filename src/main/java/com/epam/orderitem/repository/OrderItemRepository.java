package com.epam.orderitem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;


import com.epam.orderitem.dto.OrderItem;
@Controller
public interface OrderItemRepository   extends CrudRepository<OrderItem, Long>{

}
