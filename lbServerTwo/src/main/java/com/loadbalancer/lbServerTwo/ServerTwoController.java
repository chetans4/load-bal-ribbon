package com.loadbalancer.lbServerTwo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController("/server")
@RestController
@RequestMapping("/server")
public class ServerTwoController {
	
	@Value("${server.port}")
	private String port;

	@GetMapping("/port")
	public String getPort() {
		return port;
	}
	
	@GetMapping("/")
	public String getHello() {
		return "hello...";
	}
	
}
