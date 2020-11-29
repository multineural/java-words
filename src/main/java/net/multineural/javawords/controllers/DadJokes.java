package net.multineural.javawords.controllers;

import net.multineural.javawords.service.DadJokeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jokes")
public class DadJokes {


    private DadJokeService dadJokeService;

    public DadJokes(final DadJokeService dadJokeService) {
        this.dadJokeService = dadJokeService;
    }

    @GetMapping(value = "/dad/random", produces = {"application/json"})
    public String randomDadJoke() {
        return dadJokeService.random();
    }


}
