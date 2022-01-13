package com.devScurso.movie.reprositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devScurso.movie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
