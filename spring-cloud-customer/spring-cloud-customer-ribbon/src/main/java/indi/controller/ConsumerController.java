package indi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	@Autowired
    RestTemplate restTemplate;
	
	@RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
		return restTemplate.getForObject("http://spring-cloud-provider-high-available/hello?name="+name, String.class);
	}

}
