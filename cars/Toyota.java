public class Toyota extends Car {

    public Toyota(String color) {
        super("silver");
    }

    @Override
    public int getMaxSpeed() {
        return 200;
    }

    @Override
    public boolean isSportsCar() {
        return false;
    }
}
