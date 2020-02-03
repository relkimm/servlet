package me.chillgu;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String getName(String name) {
		return name;
	}
}
