package com.example.ctrl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Home {
	@GetMapping(value = "/getnames")
	public List<String> getName() {
		List<String> l = new ArrayList();
		l.add("sridhar");
		l.add("sridhar1");
		l.add("sridhar3");
		l.add("sridhar2");
			
		return l;
	}

}
