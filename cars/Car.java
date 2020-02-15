public class Car {

    private int maxSpeed;
    private boolean isSportsCar;
    private String color;

    public Car(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isSportsCar() {
        return isSportsCar;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {

        Car car = new Car("");

        Car ferrari1 = new Ferrari("");
        Car toyota1 = new Toyota("");
        Car audi1 = new Audi("gray");


        System.out.println("Does Ferrari have automap: " + ferrari1.hasAutoMap(true));
        System.out.println("Does Audi have automap: " + audi1.hasAutoMap(true));
        System.out.println("Does Toyota stops at red sign: " + toyota1.stopsAtRedSign(false));

        System.out.println("Ferrari color: " + ferrari1.color);
        System.out.println("Toyota color: " + toyota1.color);
        System.out.println("Audi color: " + audi1.color);
    }


    public String autoParking() {
        System.out.println("auto parking method");
        return 0;
    }

    private boolean stopsAtRedSign(boolean doesStop) {
        return doesStop;
    }

    public boolean hasAutoMap(boolean hasMap) {
        return hasMap;
    }


}
