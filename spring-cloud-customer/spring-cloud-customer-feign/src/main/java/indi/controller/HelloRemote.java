package indi.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(name = "spring-cloud-producer")
@FeignClient(name = "spring-cloud-provider-high-available")
public interface HelloRemote {
	@RequestMapping(value = "/hello")
	public String hello(@RequestParam(value = "name") String name);
}
