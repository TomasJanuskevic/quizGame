package com.quizzGame.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Entity(name = "PLAYERS")
@NoArgsConstructor
@Getter
@ToString
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private String name;

    public Player(String name) {
        this.name = name;
    }
}
