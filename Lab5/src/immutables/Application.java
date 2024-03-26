package immutables;

public class Application {
    public static void main(String[] args) {
        Car car = new Car("Jaguar", "XK120", "green");

        Garage garage = new Garage(2, car);
        System.out.println("Garage mutable: " + garage.getCar());

        GarageImmutable garageImmutable = new GarageImmutable(2, car);

        //schimbam masina din garage si garageImmutable
        car.setColor("black");

        //garage preia masina schimbata
        System.out.println("Garage mutable: " + garage.getCar());

        //garageImmutable nu preia noua masina
        Car car2 = garageImmutable.getCar();
        Car car3 = garageImmutable.getCar();
        System.out.println("Garage immutable: " + car2);
        System.out.println("Garage immutable: " + car3);
    }
}
