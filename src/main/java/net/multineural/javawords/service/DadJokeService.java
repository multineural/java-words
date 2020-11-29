package net.multineural.javawords.service;

import net.multineural.javawords.model.Joke;
import org.springframework.stereotype.Service;

@Service
public interface DadJokeService {
    Joke random();
}
