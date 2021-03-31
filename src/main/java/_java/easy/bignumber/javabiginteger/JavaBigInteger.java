package _java.easy.bignumber.javabiginteger;

import java.math.BigInteger;

public class JavaBigInteger {

    public String solution(String input) {
    
        String[] numbers = input.split("\n");
        BigInteger bigint1 = new BigInteger(numbers[0]);
        BigInteger bigint2 = new BigInteger(numbers[1]);
        
        return bigint1.add(bigint2) + "\n" + bigint1.multiply(bigint2);
    }
}
