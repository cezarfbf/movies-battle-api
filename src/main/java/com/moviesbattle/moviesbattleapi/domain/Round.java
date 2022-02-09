package com.moviesbattle.moviesbattleapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Round {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Movie movieA;
    @OneToOne
    private Movie movieB;
    private Integer point;
//    @JoinColumn(name = "match_id")
    @ManyToOne
    private Match match;

}
