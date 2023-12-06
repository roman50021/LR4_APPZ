package com.example.appz_lr4.controllers;

import com.example.appz_lr4.model.MobileDevice;
import com.example.appz_lr4.services.MobileDeviceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class HelloController {
    private final MobileDeviceService service;

    @GetMapping(path = "/")
    public @ResponseBody String returnHelloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/all")
    public @ResponseBody List<MobileDevice> all(){
        return service.findAll();
    }
}
