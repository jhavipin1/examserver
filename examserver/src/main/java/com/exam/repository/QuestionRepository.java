package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.entity.exam.Question;
import com.exam.entity.exam.Quiz;

import java.util.Set;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    Set<Question> findByQuiz(Quiz quiz);
}
