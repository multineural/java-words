package net.multineural.javawords.controllers;

import net.multineural.javawords.model.Joke;
import net.multineural.javawords.service.DadJokeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DadJokes.class)
public class DadJokesTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DadJokeService dadJokeService;

    @Test
    public void testDadRandom() throws  Exception {

        Joke joke = new Joke();
        joke.setText("Welcome to conjunctivitis.com, a site for sore eyes.");

        when(dadJokeService.random()).thenReturn(joke);

        this.mockMvc.perform(get("/jokes/dad/random")).andExpect(status().isOk());

    }

}
