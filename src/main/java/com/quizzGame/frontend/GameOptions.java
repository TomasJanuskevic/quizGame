package com.quizzGame.frontend;

import lombok.Data;

@Data
public class GameOptions {
    private int numberOfQuestions = 5;
    private Difficulty difficulty;
}
