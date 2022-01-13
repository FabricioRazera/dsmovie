package com.devScurso.movie.reprositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devScurso.movie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
