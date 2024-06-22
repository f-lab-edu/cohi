package com.cohi.order;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

	@GetMapping("/order/create")  
	public String create() {  
	    return "order/create";  
	}  
}
