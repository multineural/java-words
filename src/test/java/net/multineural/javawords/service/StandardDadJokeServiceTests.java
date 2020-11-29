package net.multineural.javawords.service;

import net.multineural.javawords.model.Joke;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class StandardDadJokeServiceTests {

	// no fancy injection needed, yet
	StandardDadJokeService service = new StandardDadJokeService();

	@Test
	public void testRandom() throws Exception {

		Joke joke = service.random();
		assertTrue(joke.getText().startsWith("Welcome"));

	}

}
