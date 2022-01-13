package com.devScurso.movie.reprositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devScurso.movie.entities.Score;
import com.devScurso.movie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

	Score saveAndFlush(Score score);


}
