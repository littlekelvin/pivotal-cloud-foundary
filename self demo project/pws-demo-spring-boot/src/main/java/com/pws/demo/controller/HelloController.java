package com.pws.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kelvin Mai
 * @date 2/10/2020
 */
@RestController
public class HelloController {

  @RequestMapping({"/","/hello"})
  public String hello() {
    return "V2: Hello Pivotal Web Service V2";
  }
}
