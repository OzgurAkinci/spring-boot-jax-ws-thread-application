package com.ws.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
@Component
public class TestController {
    @GetMapping("/executeWithoutThread")
    public String list() {
        /*ObjectFactory objectFactory = new ObjectFactory();
        GetExpenseRequest a = objectFactory.createGetExpenseRequest();
        a.setId(1);
        GetExpense b = objectFactory.createGetExpense();*/
        return "done";
    }
}
