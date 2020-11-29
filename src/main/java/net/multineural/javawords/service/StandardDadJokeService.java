package net.multineural.javawords.service;

import net.multineural.javawords.model.Joke;
import org.springframework.stereotype.Service;

@Service
public class StandardDadJokeService implements DadJokeService {

    @Override
    public Joke random() {

        Joke joke = new Joke();
        joke.setText("Welcome to conjunctivitis.com, a site for sore eyes.");
        return joke;

    }


}
