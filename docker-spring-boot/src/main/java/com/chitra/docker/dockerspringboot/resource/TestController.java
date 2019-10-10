package com.chitra.docker.dockerspringboot.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class TestController {
	
	@GetMapping
	public String test() {
		return "newBlog";
	}
}
