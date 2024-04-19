package interviewpreparationkit.arrays.hourglass;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HourGlassSumTest {

	@Test
	void testExample() {

		List<List<Integer>> input = List.of(List.of(-9, -9, -9, 1, 1, 1),
				List.of( 0, -9  ,0  ,4 ,3 ,2),
				List.of(-9, -9, -9  ,1 ,2 ,3),
				List.of( 0,  0  ,8  ,6 ,6 ,0),
				List.of( 0,  0  ,0, -2 ,0 ,0),
				List.of( 0,  0,  1,  2 ,4 ,0)
		);

		assertEquals(28, HourGlassSum.hourglassSum(input));
	}

	@Test
	void testExample2() {

		List<List<Integer>> input = List.of(
				List.of(1, 1, 1, 0, 0, 0),
				List.of(0, 1, 0, 0, 0, 0),
				List.of(1, 1, 1, 0, 0, 0),
				List.of(0, 0, 2, 4, 4, 0),
				List.of(0, 0, 0, 2, 0, 0),
				List.of(0, 0, 1, 2, 4, 0)
		);

		assertEquals(19, HourGlassSum.hourglassSum(input));
	}

}