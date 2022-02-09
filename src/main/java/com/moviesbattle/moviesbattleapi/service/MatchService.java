package com.moviesbattle.moviesbattleapi.service;

import com.moviesbattle.moviesbattleapi.domain.Match;

public interface MatchService {

    void start();
    void end();
    Match getCurrent();

}
