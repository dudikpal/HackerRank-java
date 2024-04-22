package interviewpreparationkit.arrays.left_rotation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeftRotationTest {

	@Test
	void testExample1() {
		List <Integer> inputArr = List.of(1, 2, 3, 4, 5);
		int inputStep = 4;
		List <Integer> expectedArr = List.of(5, 1, 2, 3, 4);


		assertEquals(expectedArr, LeftRotation.rotLeft(inputArr, inputStep));
	}

}