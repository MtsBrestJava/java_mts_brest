package by.mts.brest.java.classes_deeper;

public class Lesson10AnonymousClass {
    public static void main(String[] args) {
        Car myCar = new Car(2,"BMW");
        Car myCar2 = new Car(6,"AUDI");
        //System.out.println("myCar = " + myCar);
        //System.out.println("myCar2 = " + myCar2);
        myCar.printer();
        myCar2.printer();

        Car myCustomCar = new Car(7, "Toyota") {
            @Override
            public void printer() {
                System.out.println("volume = " + volume);
                System.out.println("MANUFACTURER = " + manufacturer);
                anonymMethod();
            }

            public void anonymMethod() {
                System.out.println("anonymMethod()");
            }

        };
        myCustomCar.printer();
    }
}

class Car {
    int volume;
    String manufacturer;

    public Car(int volume, String manufacturer) {
        this.volume = volume;
        this.manufacturer = manufacturer;
    }
    
    public void printer() {
        System.out.println("volume = " + volume);
        System.out.println("manufacturer = " + manufacturer);
    }

    @Override
    public String toString() {
        return "Car{" +
                "volume=" + volume +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

/*class CustomCar extends Car {

    public CustomCar(int volume, String manufacturer) {
        super(volume, manufacturer);
    }

    @Override
    public void printer() {
        System.out.println("volume = " + volume);
        System.out.println("MANUFACTURER = " + manufacturer);
    }

}*/
