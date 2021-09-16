package com.quizzGame.config;

import com.quizzGame.frontend.QuizzDataService;
import com.quizzGame.model.Player;
import com.quizzGame.repository.PlayerRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Log
public class StartupRunner implements CommandLineRunner {

    @Autowired
    private QuizzDataService quizzDataService;

    @Override
    public void run(String... args) throws Exception {
        log.info("Executing startup actions...");


        quizzDataService.getQuizCategories();
    }
}
