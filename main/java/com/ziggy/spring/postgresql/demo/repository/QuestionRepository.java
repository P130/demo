package com.ziggy.spring.postgresql.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ziggy.spring.postgresql.demo.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
	

}
