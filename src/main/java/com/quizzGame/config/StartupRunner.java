package com.quizzGame.config;

import com.quizzGame.frontend.QuizDataService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Log
public class StartupRunner implements CommandLineRunner {

    @Autowired
    private QuizDataService quizzDataService;

    @Override
    public void run(String... args) throws Exception {
        log.info("Executing startup actions...");


        quizzDataService.getQuizCategories();
    }
}
