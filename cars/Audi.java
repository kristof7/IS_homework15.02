public class Audi extends Car {

    public Audi(String color) {
        super(color);
    }

    @Override
    public boolean hasAutoMap(boolean hasMap) {
        return false;
    }

    @Override
    public int getMaxSpeed() {
        return 180;
    }

    @Override
    public boolean isSportsCar() {
        return false;
    }
}
