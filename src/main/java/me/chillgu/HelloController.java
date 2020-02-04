package me.chillgu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	@GetMapping("/hello/{id}")
	@ResponseBody
	public String hello(@PathVariable int id) {
		return "Hello, " + helloService.getName();
	}
	
	@GetMapping("/sample")
	public String sample() {
		return "sample";
	}
}
