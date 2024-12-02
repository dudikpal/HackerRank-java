package problem_solving.easy.implementation.apple_and_orange;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AppleAndOrangeTest {

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	//private int[] ;

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@AfterEach
	public void tearDown() {
		System.setOut(standardOut);
	}

	@ParameterizedTest
	@MethodSource("params")
	void test(int s, int t, int a, int b, List <Integer> apples, List<Integer> oranges, String expected) {
		AppleAndOrange.countApplesAndOranges( s,  t,  a,  b, apples, oranges);

		assertEquals(expected, outputStreamCaptor.toString().trim());
	}

	@Test
	void test2() {

		InputStream is = getClass().getResourceAsStream("input.txt");
		try (BufferedReader br = new BufferedReader(new InputStreamReader(is))){

			int s = 0;
			int t = 0;
			int a = 0;
			int b = 0;
			List<Integer> apples;
			List<Integer> oranges;
			int[]line = Arrays.stream(br.readLine().split("\s")).mapToInt(string -> Integer.parseInt(string)).toArray();
			s = line[0];
			t = line[1];
			line = Arrays.stream(br.readLine().split("\s")).mapToInt(string -> Integer.parseInt(string)).toArray();
			a = line[0];
			b = line[1];
			br.readLine();
			String[] appleLine = br.readLine().split("\s");
			String[] orangeLine = br.readLine().split("\s");
			apples = Arrays.stream(appleLine).mapToInt(Integer::parseInt).boxed().toList();
			oranges = Arrays.stream(orangeLine).mapToInt(Integer::parseInt).boxed().toList();
			System.out.println(apples.get(0));
			System.out.println(apples.get(apples.size() - 1));
			System.out.println(oranges.get(0));
			System.out.println(oranges.get(oranges.size() - 1));
			AppleAndOrange.countApplesAndOranges(s, t, a, b, apples, oranges);

		} catch (IOException e) {
			e.printStackTrace();
		}
		String expected = """
				2530
				1149""";
		assertEquals(expected, outputStreamCaptor.toString().trim());
	}

	static Stream<Arguments> params() {
		return Stream.of(
				Arguments.arguments(7, 11, 5, 15, List.of(-2, 2, 1), List.of(5, -6), """
						1
						1""")
		);
	}

}