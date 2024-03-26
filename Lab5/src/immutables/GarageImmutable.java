package immutables;

public final class GarageImmutable {
    private final int numberCars;
    private final Car car;

    public GarageImmutable(int numberCars, Car car) {
        this.numberCars = numberCars;
        this.car = new Car(car);    // se creaza obiect nou
    }

    public int getNumberCars() {
        return numberCars;
    }

    public Car getCar() {
        return new Car(car); // returneaza referinta catre o copie a obiectului
    }
}
