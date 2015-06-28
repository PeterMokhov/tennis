package tennis;

import static org.junit.Assert.*;

import org.junit.Test;

public class SetTest {

	Set a = new Set();
	Game game = new Game(2,2);
	Set b = new Set();
	
	@Test
	public void Addtest() {
		a.add(game);
		assertTrue(a.contains(game));
	}
	
	@Test
	public void SetWonTest(){
		
	}

}
