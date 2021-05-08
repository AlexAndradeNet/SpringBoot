package org.example.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

	private static final String     template = "Hello, %s!";
	private final        AtomicLong counter  = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@PostMapping( "/greeting/add" )
	@ResponseStatus( HttpStatus.CREATED )
	public Greeting addGretting( @RequestBody String contenido ) {
		return new Greeting(counter.incrementAndGet(), "Bienvenido parcero");
	}

}
