package com.siddu.gamesense.repository;

import com.siddu.gamesense.Entities.User;
import com.siddu.gamesense.Entities.UserGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


    Optional<User> findByUserId(String userId);

    @Query("SELECT u.userId FROM User u")
    List<String> findAllUserIds();
}
