package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private IDemoService iDemoService;

    @GetMapping(path = "/dummy")
    public String dummy(){
        return "dummy Response";
    }

    @PostMapping(value = "save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String save(@RequestBody Demo demo){
        return iDemoService.save(demo);
    }

    @GetMapping(path = "/findAll")
    public List<Demo> findAll(){
        return iDemoService.findAll();
    }
}
