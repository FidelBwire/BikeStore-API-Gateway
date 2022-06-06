package com.bikestore.apigateway.fallback;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

	@RequestMapping("/productionFallback")
	public Mono<String> productionServiceFallback() {
		return Mono.just("Production service is taking too long or is down. Please try again later");
	}
	
	@RequestMapping("/hrFallback")
	public Mono<String> hrServiceFallback() {
		return Mono.just("HR service is taking too long or is down. Please try again later");
	}
	
	@RequestMapping("/salesFallback")
	public Mono<String> salesServiceFallback() {
		return Mono.just("Sales service is taking too long or is down. Please tryagain later");
	}
}
