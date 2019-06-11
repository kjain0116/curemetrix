import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class DistanceTest {

	@Test
	public void testDistance() {
		Questions test = new Questions();
		int[] result = test.distance("aaaaa");
		int[] expectedResult = new int[] {0,0,0,0,0};
		Assert.assertArrayEquals(expectedResult, result);
		result = test.distance("babbb");
		expectedResult = new int[] {1,0,1,1,1};
		Assert.assertArrayEquals(expectedResult, result);
		result = test.distance("abcdabcd");
		expectedResult = new int[] {0,1,2,1,0,1,2,1};
		Assert.assertArrayEquals(expectedResult, result);
		result = test.distance("shopper");
		expectedResult = new int[] {2,1,0,1,1,0,3};
		Assert.assertArrayEquals(expectedResult, result);
		
	}

}