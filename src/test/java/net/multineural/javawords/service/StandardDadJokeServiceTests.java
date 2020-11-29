package net.multineural.javawords.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

//@SpringBootTest
class StandardDadJokeServiceTests {

	// no fancy injection needed, yet
	StandardDadJokeService service = new StandardDadJokeService();

	@Test
	public void testRandom() throws Exception {

		String joke = service.random();
		assertTrue(joke.startsWith("Welcome"));

	}

}
