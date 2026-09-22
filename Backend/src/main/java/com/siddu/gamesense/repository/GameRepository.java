package com.siddu.gamesense.repository;
import com.siddu.gamesense.Entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface GameRepository extends JpaRepository<Game, Long> {
    Optional<Game> findByparentAsin(String parentAsin);

    @Query("SELECT g.parentAsin FROM Game g")
    List<String> findAllParentAsins();
}
