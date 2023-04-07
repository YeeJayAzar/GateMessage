package com.dorf.teav;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/msg")
@RestController
public class GateMsgController {

	@GetMapping("/save")
	public String index() {
		return "Message has been saved successfully to MSG table - version 2";
	}

}