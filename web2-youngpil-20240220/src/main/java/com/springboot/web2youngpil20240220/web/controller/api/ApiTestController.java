package com.springboot.web2youngpil20240220.web.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web2youngpil20240220.web.dto.TestRespDto;
import com.springboot.web2youngpil20240220.web.dto.TestRespDto.TestRespDtoBuilder;

@RestController
@RequestMapping("/api/v1")
public class ApiTestController {

	@GetMapping("/test")
	public String getTest() {
		return "test data";
	}
	
	
	
	//responsbody 어노테이션있을때 json 자동변형
	@GetMapping("/userTest")
	public TestRespDto getUserTest() {
		return TestRespDto.builder()
				.username("gildong")
				.password("1234")
				.build();
	
	}
	
	 
	
	/*
	 * api/v1/userTest 겟요청을 보냄
	 * 메소드명 getUserTest
	 * return gildong/1234 인 객체 리턴
	 */
}
