package interviewpreparationkit.oneweekpreparationkit.day4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GridChallengeTest {

	@Test
	void test() {
		assertEquals("YES", GridChallenge.gridChallenge(List.of("abc", "ade", "efg")));
		assertEquals("YES", GridChallenge.gridChallenge(List.of("ebacd", "fghij", "olmkn", "trpqs", "xywuv")));
		assertEquals("NO", GridChallenge.gridChallenge(List.of("ebacd", "fghij", "olmkn", "trpqs", "xywua")));
	}


}