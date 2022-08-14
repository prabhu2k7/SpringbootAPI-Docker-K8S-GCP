package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleAPI
{
	@GetMapping("/callsample")
public String callSampleAPI()
{
	return "Sample API called - This for Docker!!";
}

}
