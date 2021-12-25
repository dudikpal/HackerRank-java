package contests.project_euler.largest_prime_factor;

public class LargestPrimeFactor {

    public long solution(long n) {
        
        long max = 2;

        while (max <= Math.floor(Math.sqrt(n))) {
            if (n % max == 0) {
                n /= max;
            } else {
                max++;
            }
        }
        return n;
    }
}
