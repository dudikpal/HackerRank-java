public class WorkClass {

    public static void main(String[] args) {

        // initializers

        int[] q = {5,1,2,3,7,8,6,4};

        // methods
        /*for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > i + 3 || numbers[i] < i - 1) {
                return;
            }
        }*/
        int counter = 0;
        int chaoticCounter = 0;
        for (int i = 0; i < q.length - 1; i++) {
            chaoticCounter= 0;
            for (int j = i + 1; j < q.length; j++) {
                if (q[i] > q[j]) {
                    counter++;
                    chaoticCounter++;
                    if (chaoticCounter > 2) {
                        System.out.println("Too chaotic");
                        return;
                    }
                }
            }
        }
        System.out.println(counter);




    }
}
