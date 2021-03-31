package _java.easy.bignumber.javaprimalitytest;

import java.math.BigInteger;

public class JavaPrimalityTest {
    
    public String solution(String input) {
    
        BigInteger bi = new BigInteger(input);
        if (bi.isProbablePrime(100)) {
            return "prime";
        }
        return "not prime";
    }
}
