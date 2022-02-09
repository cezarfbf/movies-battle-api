package com.moviesbattle.moviesbattleapi.repository;

import com.moviesbattle.moviesbattleapi.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MoviesRepository extends JpaRepository<Movie, Long> {

    @Query(nativeQuery=true, value="SELECT * FROM MOVIE ORDER BY random() LIMIT 2")
    List<Movie> findRandomPair();


}
