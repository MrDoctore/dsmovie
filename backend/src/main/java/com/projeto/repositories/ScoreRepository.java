package com.projeto.repositories;

import com.projeto.entities.Score;
import com.projeto.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
