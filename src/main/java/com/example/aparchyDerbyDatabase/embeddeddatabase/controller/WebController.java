package com.example.aparchyDerbyDatabase.embeddeddatabase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//this is for example of spring -boot thymeleafe template
@Controller
public class WebController {
   @RequestMapping(value = "/index")
   public String index() {
      return "index";
   }
}