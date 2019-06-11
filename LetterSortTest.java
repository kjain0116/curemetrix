import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class LetterSortTest {

	@Test
	public void testDistance() {
		Questions test = new Questions();
		String result = test.letterSort("hello");
		assertEquals("ehllo", result);
		result = test.letterSort("edabit");
		assertEquals("abdeit", result);
		result = test.letterSort("hacker");
		assertEquals("acehkr", result);
		result = test.letterSort("geek");
		assertEquals("eegk", result);
		result = test.letterSort("javascript");
		assertEquals("aacijprstv", result);
	}

}