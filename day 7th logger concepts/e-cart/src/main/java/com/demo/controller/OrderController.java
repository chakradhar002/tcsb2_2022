package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Order;
import com.demo.service.OrderService;

@RestController
public class OrderController {
	
 private static final Logger log = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	OrderService OrderService;

	@PostMapping(value="/createoreder")
	Order addOrder(@RequestBody Order order) {
		
		log.info(" ******** in OrderController class**** "+order.getOrderamount());
		log.info(" ******** in OrderController class**** "+order.getShippingaddress());

		Order addorder = OrderService.createOder(order);
		log.info(" ******** in after called service class**** ");
		return addorder;

	}

}
