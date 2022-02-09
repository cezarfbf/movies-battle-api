package com.moviesbattle.moviesbattleapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/game")
public class GameController {

    @PostMapping(value = "start")
    public String startGameMatch() {
        return "match stared";
    }

    @PostMapping(value = "end")
    public String endGameMatch() {
        return "match ended";
    }
}
