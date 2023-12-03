package interviewpreparationkit.oneweekpreparationkit.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CaesarCipher {

	public static void main(String[] args) {

		// expected: okffng-Qwvb
		System.out.println(caesarCipher("middle-Outz", 2));
		// expected: !w-bL`-yX!.G`mVKmFlX/MaCyyvSS!CSwts.!g/`He`eJk1DGZBa`eBLdyu`hZD`vV-jZDm.LCBSre..-!.!dmv!-E
		System.out.println(caesarCipher("!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U", 62));
		System.out.println("!w-bL`-yX!.G`mVKmFlX/MaCyyvSS!CSwts.!g/`He`eJk1DGZBa`eBLdyu`hZD`vV-jZDm.LCBSre..-!.!dmv!-E");
	}

	public static String caesarCipher(String s, int k) {
		// Write your code here
		k %= 26;
		String abcString = "abcdefghijklmnopqrstuvwxyz";
		String rotatedAbcString = abcString.substring(k).concat(abcString.substring(0, k));
		List <String> originalAbc = Arrays.stream(abcString.concat(abcString.toUpperCase()).split("")).collect(Collectors.toList());
		List<String> rotatedAbc = Arrays.stream(rotatedAbcString.concat(rotatedAbcString.toUpperCase()).split("")).collect(Collectors.toList());
		StringBuilder sb = new StringBuilder();

		for (String letter : s.split("")){
			int index = originalAbc.indexOf(letter);

			if (index < 0) {
				sb.append(letter);
			} else {
				sb.append(rotatedAbc.get(index));
			}
		}

		return sb.toString();
	}
}
