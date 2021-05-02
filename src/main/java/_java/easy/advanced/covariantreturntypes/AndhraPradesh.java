package _java.easy.advanced.covariantreturntypes;

public class AndhraPradesh extends Region{

    @Override
    Flower yourNationalFlower() {
        return new Lily();
    }
}
