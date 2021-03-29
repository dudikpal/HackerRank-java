package applications.hackerranklanguage;

import java.util.Arrays;
import java.util.List;

public class HackerRankLanguage {
    
    public String check(){
        
        String testString = "39\n" +
                                "92685 CSHARP\n" +
                                "95992 VWTDH\n" +
                                "44524 LUA\n" +
                                "77017 VHUO\n" +
                                "32008 HASKELL\n" +
                                "22728 GJPGTRKN\n" +
                                "80227 GO\n" +
                                "10863 PVR\n" +
                                "43570 TCB\n" +
                                "40663 NBDYCXKMK\n" +
                                "15793 JSOMPFXNRA\n" +
                                "77843 GIOVG\n" +
                                "74560 ERLANG\n" +
                                "57908 OBJECTIVEC\n" +
                                "71998 R\n" +
                                "13205 CLISP\n" +
                                "61039 CSHARP\n" +
                                "56694 RUW\n" +
                                "74950 SBCL\n" +
                                "67712 D\n" +
                                "20078 R\n" +
                                "76382 ZKBEY\n" +
                                "74990 YZCPV\n" +
                                "62821 JAVA\n" +
                                "96061 K\n" +
                                "69569 CPP\n" +
                                "22505 PYTHON\n" +
                                "25141 UMEM\n" +
                                "54864 CLISP\n" +
                                "65843 LUA\n" +
                                "25080 CPP\n" +
                                "44108 CKWHM\n" +
                                "22862 D\n" +
                                "90203 GO\n" +
                                "42767 OCAML\n" +
                                "17971 LUA\n" +
                                "63445 JAVASCRIPT\n" +
                                "36250 PYTHON\n" +
                                "60387 OK";
        
        String[] testStrings = testString.split("\n");
        int numberOfLines = Integer.parseInt(testStrings[0]);
        String[] languagesString = "C:CPP:JAVA:PYTHON:PERL:PHP:RUBY:CSHARP:HASKELL:CLOJURE:BASH:SCALA: ERLANG:CLISP:LUA:BRAINFUCK:JAVASCRIPT:GO:D:OCAML:R:PASCAL:SBCL:DART: GROOVY:OBJECTIVEC".split("\\s*:\\s*");
        List<String> languages = Arrays.asList(languagesString);
        StringBuilder sb = new StringBuilder();
        String SEPARATOR = "";
        
        for (int i = 1; i <= numberOfLines; i++) {
            sb.append(SEPARATOR);
            if (languages.contains(testStrings[i].split(" ")[1])) {
                sb.append("VALID");
            } else {
                sb.append("INVALID");
            }
            SEPARATOR = "\n";
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
