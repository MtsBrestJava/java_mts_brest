package by.mts.brest.java.Examples;

public class Car {

    private int year;
    private String make;
    private String model;
    private double fuel;
    private Boolean drivable;

    public Car()
    {
        super();
        this.year = 1935;
        this.make = "Ford";
        this.model = "Coupe";
        this.fuel = 1.0;
        this.drivable = true;
    }

    public void setDrivable(Boolean drivable) {
        this.drivable = drivable;
    }

    public Boolean isDrivable() {
        return drivable;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString(){
        return "Car@" + hashCode() + " [drivable="+isDrivable()+", make="+getMake()+", model="+getModel()+", year="+getYear()+"]";
    }

    /**
     * POJOs are a simple data structure that can be passed around easily.
     * I would argue that this method as well as the printStatus method are business logic and should be handled by another class
     * Create CarManagment class or Interface or that has operations that can be performed on cars
     **/
    void driveCar(int distance) {
        double usedFuel = (fuel / 20) * distance;
        fuel = fuel - usedFuel;

        if (fuel <= 0) {
            drivable = false;
        }
    }

    private void printStatus() {
        if (isDrivable()) {
            System.out.println("You ran out out of fuel in your " + getYear() + " " + getMake() + " " + getModel() + " and had to walk 2 days to find civilization.");
        } else {
            System.out.println("You drove your " + getYear() + " " + getMake() + " " + getModel() + " and you have " + fuel + " fuel left.");
        }
    }
}
