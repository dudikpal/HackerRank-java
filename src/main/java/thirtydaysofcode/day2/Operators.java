package thirtydaysofcode.day2;

public class Operators {

    public static int solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        return (int)Math.round(meal_cost + meal_cost * tax_percent / 100 + meal_cost * tip_percent / 100);
    }
}
