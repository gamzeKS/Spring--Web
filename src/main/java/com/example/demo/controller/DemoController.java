package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {

    //http://localhost:8081/demo?name=ali
    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.CREATED)
    public String merhaba(@RequestParam(required = false) String name,@RequestHeader String deneme) {
        return name + " " + deneme;
    }

    @GetMapping("q")
    @ResponseStatus(HttpStatus.CREATED)
    public String merhaba3(@RequestHeader String name,@RequestHeader String fast){
        return name + " Merhabalar " + fast + " Kedi";
    }

    @GetMapping("{name}" + "/" + "{fast}" + "/" + "{hizli}")
    @ResponseStatus(HttpStatus.CREATED)
    public String merhaba2(@PathVariable String name,@PathVariable String fast,@PathVariable String hizli){

       return name + " " + fast + " " + hizli;
    }

    @GetMapping("b")
    @ResponseStatus(HttpStatus.CREATED)
    public UserRequest merhaba4(@RequestBody UserRequest request) {
        return request;
    }

}
