package com.siddu.gamesense.repository;


import com.siddu.gamesense.Entities.GameMetadata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GameMetadataRepository extends JpaRepository<GameMetadata, Long> {

}
