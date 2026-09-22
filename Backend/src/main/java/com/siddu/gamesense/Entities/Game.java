package com.siddu.gamesense.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "games")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "parent_asin", nullable = false, unique = true)
    private String parentAsin;

    @OneToOne(mappedBy = "game", cascade = CascadeType.ALL)
    private GameMetadata metadata;

    @OneToMany(mappedBy = "game")
    private List<UserGame> userGames = new ArrayList<>();
}