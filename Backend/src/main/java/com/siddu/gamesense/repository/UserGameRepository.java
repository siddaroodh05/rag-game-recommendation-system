package com.siddu.gamesense.repository;

import com.siddu.gamesense.Entities.UserGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserGameRepository extends JpaRepository<UserGame, Long> {
    @Query("SELECT u.sourceKey FROM UserGame u")
    List<String> findAllSourceKeys();
}
