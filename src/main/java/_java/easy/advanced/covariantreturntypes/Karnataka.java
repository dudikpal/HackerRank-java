package _java.easy.advanced.covariantreturntypes;

public class Karnataka extends Region{

    @Override
    Flower yourNationalFlower() {
        return new Lotus();
    }
}
