package net.multineural.javawords.service;

import org.springframework.stereotype.Service;

@Service
public class StandardDadJokeService implements DadJokeService {

    @Override
    public String random() {
        return "Welcome to conjunctivitis dot com. A site for sore eyes.";
    }

}
