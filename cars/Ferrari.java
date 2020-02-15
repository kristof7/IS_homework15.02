public class Ferrari extends Car {


    public Ferrari(String color) {
        super("red");
    }

    @Override
    public boolean hasAutoMap(boolean hasMap) {
        return true;
    }

    @Override
    public int getMaxSpeed() {
        return 300;
    }

    @Override
    public boolean isSportsCar() {
        return true;
    }
}
