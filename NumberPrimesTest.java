import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NumberPrimesTest {

	@Test
	public void testPersistence() {
		Questions test = new Questions();
		int result = test.numberPrimes(10);
		assertEquals(4, result);
		result = test.numberPrimes(20);
		assertEquals(8, result);
		result = test.numberPrimes(30);
		assertEquals(10, result);
	}

}