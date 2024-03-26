package immutables;

public class Garage {
    private int numberCars;
    private Car car;

    public Garage(int numberCars, Car car) {
        this.numberCars = numberCars;
        this.car = car;
    }

    public int getNumberCars() {
        return numberCars;
    }

    public Car getCar() {
        return car; // returneaza referinta la obiect
    }

    public void setNumberCars(int numberCars) {
        this.numberCars = numberCars;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
