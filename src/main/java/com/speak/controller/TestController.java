package com.speak.controller;

import com.speak.repository.Languages;
import com.speak.repository.LanguagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    LanguagesRepository languagesRepository;

@GetMapping("/german")
    public void addInDB() {
        Languages languages = new Languages();
        languages.setLanguageName("German");
        languagesRepository.save(languages);
    }
}
