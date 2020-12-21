package com.example.demo.controllers;

import com.demo.lib.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkController {
    @Autowired
    private Worker worker;
    @GetMapping("start")
    String start(){
        return worker.start();
    }
    @GetMapping("work")
    String work(){
        return worker.work();
    }
    @GetMapping("finish")
    String finish(){
        return worker.finish();
    }
}
