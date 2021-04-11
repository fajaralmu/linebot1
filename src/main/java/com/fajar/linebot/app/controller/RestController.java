package com.fajar.linebot.app.controller;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@GetMapping("hello")
    public Map<String, Object> callback(HttpServletRequest httpServletRequest) {
        
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("message", "Hello World");
		map.put("date", new Date());
		return map;
    }
}
