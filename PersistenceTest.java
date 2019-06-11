import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PersistenceTest {

	@Test
	public void testPersistence() {
		Questions test = new Questions();
		int result = test.persistence(39);
		assertEquals(3, result);
		result = test.persistence(999);
		assertEquals(4, result);
		result = test.persistence(4);
		assertEquals(0, result);
	}

}