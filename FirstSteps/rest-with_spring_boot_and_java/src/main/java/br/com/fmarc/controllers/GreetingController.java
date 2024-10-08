package br.com.fmarc.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fmarc.services.GreetingService;

@RestController	
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public GreetingService greeting (
			@RequestParam(value = "name", defaultValue = "World")	
			String name) {
		return new GreetingService(counter.incrementAndGet(),String.format(template, name));
	}
}
