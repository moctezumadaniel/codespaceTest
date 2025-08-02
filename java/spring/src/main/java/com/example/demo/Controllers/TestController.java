package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
class SimpleDto {
    SimpleDto(Integer a, String b){
        this.name = b;
        this.age = a;
    }
    public Integer age;
    public String name;
}
@RestController()
public class TestController {
    @GetMapping("hello")
    public SimpleDto hello() {
        return new SimpleDto(1000, "DDDDDD");
    }
}