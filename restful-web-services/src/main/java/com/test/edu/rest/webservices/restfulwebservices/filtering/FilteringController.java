package com.test.edu.rest.webservices.restfulwebservices.filtering;

import java.util.List;

import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
	
	@GetMapping("/filtering")
	public SomeBean retriveSomeBean() {
		return new SomeBean("value1","value2","value3");
	}

	@GetMapping("/filtering-list")
	public List<SomeBean1> retriveListOfSomeBeans() {
		return Arrays.asList(new SomeBean1("value1","value2","value3"),new SomeBean1("value11","value22","value33"));
	}

}
