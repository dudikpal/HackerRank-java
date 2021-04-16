package _java.easy.advanced.factorypattern;

class FoodFactory {
    public Food getFood(String order) {

//Write your code here
        if (order.toLowerCase().equals("pizza")) {
            return new Pizza();
        } else {
            return new Cake();
        }
    }
}