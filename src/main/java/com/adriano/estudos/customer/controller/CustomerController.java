package com.adriano.estudos.customer.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/customers")
public class CustomerController {
	
	@GetMapping
    public Map<Long, String> findAll() {
		Map<Long, String> map = new HashMap<Long, String>();
		map.put(1L, "Customer 1");
		map.put(2L, "Customer 2");
		map.put(3L, "Customer 3");
		map.put(4L, "Customer 4");
        return map;
    }

}
