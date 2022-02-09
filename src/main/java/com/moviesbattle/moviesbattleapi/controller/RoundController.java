package com.moviesbattle.moviesbattleapi.controller;

import org.springframework.data.util.Pair;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/round")
public class RoundController {

    @GetMapping("movies")
    public Pair<String, String> getRoundMoviePair(){
        return Pair.of("","");
    }
}
