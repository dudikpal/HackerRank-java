package interviewpreparationkit.oneweekpreparationkit.day4;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecursiveDigitSumTest {

	@Test
	void test1() {
		String n = "9875";
		int k = 4;
		assertEquals(8, RecursiveDigitSum.superDigit(n, k));
	}

	@Test
	void test2() {
		String n = "148";
		int k = 3;
		assertEquals(3, RecursiveDigitSum.superDigit(n, k));
	}

	@Test
	void test3() {
		String n = "123";
		int k = 3;
		assertEquals(9, RecursiveDigitSum.superDigit(n, k));
	}

	@Test
	void test4() throws IOException {
		String n = new String(Files.readAllBytes(Paths.get("src/main/resources/RecursiveDigitSumTest.txt")));
		int k = 100000;
		assertEquals(9, RecursiveDigitSum.superDigit(n, k));
	}
}