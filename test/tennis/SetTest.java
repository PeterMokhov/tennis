package tennis;

import static org.junit.Assert.*;

import org.junit.Test;

public class SetTest {

	@Test
	public void AddTest() {
		Score a = new Score(15,2);
		Set b = new Set();
		b.add(a);
		assertTrue(b.contains(a));
	}

}
