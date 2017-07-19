package com.smilingfrog.game.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @RequestMapping("/")
    public String test(){
        return "Test!";
    }
}
