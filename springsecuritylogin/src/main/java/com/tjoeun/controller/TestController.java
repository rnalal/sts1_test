package com.tjoeun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/test")
@Controller
public class TestController {
	
	@GetMapping("/all")
	public void doAll() {
		log.info("권한없이 모두 접속 가능함");
	}

  @GetMapping("/member")
  public void doMember() {    
    log.info("member 권한으로 로그인했을 때만 접속 가능함");
  }
  
  @GetMapping("/admin")
  public void doAdmin() {    
    log.info("admin 권한으로 로그인했을 때만 접속 가능함");
  }  
  
}




