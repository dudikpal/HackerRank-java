package _java.easy.advanced.covariantreturntypes;

public class WestBengal extends Region{

    @Override
    Flower yourNationalFlower() {
        return new Jasmine();
    }
}
