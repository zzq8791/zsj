package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ZsjController {

	@RequestMapping("/zsjPage")
    public String findBookPage(){
        return "user/zsj";
    }
	
}
