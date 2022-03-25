package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.HelloWorldBean;

@RestController
@RequestMapping("/")
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "hello world!!!!!!";
	}

	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("hello world - changed changed");
	}

	@GetMapping("/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("hello world!!!!!, %s", name));
	}


}
