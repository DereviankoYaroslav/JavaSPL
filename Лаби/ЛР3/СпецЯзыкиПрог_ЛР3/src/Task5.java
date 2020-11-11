public class Task5 {
    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar("Peugout", 220, 5.4, 100, 5, "середній рівень");
        Truck truck = new Truck("MAN", 150, 3.2, 500, 7, "високий рівень");

        Car[] carPark = new Car[2];
        carPark[0] = passengerCar;
        carPark[1] = truck;

        for (Car c : carPark) {
            System.out.println(c.getCarName());
            System.out.println(c.getCarSpeed() + " км/год");
            System.out.println(c.getFuelConsuption() + "л/100 км");
            System.out.println(c.getAmountOfCargo() + " кг");
            System.out.println(c.getNumberOfPassengers() + " осіб");
            System.out.println(c.getPolution());
            System.out.println();
        }
    }
}

abstract class Car {
    private String carName;
    private double maxCarSpeed;
    private double fuelConsuption;
    private double amountOfCargo;
    private int numberOfPassengers;
    private String environmentalPollution;

    public Car(String carName, double maxCarSpeed, double fuelConsuption, double amountOfCargo, int numberOfPassengers, String environmentalPollution) {
        this.carName = carName;
        this.maxCarSpeed = maxCarSpeed;
        this.fuelConsuption = fuelConsuption;
        this.amountOfCargo = amountOfCargo;
        this.numberOfPassengers = numberOfPassengers;
        this.environmentalPollution = environmentalPollution;
    }


    public String getCarName() {
        return carName;
    }

    public double getCarSpeed() {
        return maxCarSpeed;
    }

    public double getFuelConsuption() {
        return fuelConsuption;
    }

    public double getAmountOfCargo() {
        return amountOfCargo;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public String getPolution() {
        return environmentalPollution;
    }
}

class PassengerCar extends Car {

    public PassengerCar(String carName, double maxCarSpeed, double fuelConsuption, double amountOfCargo, int numberOfPassengers, String environmentalPollution) {
        super(carName, maxCarSpeed, fuelConsuption, amountOfCargo, numberOfPassengers, environmentalPollution);
    }

    @Override
    public String getCarName() {
        System.out.print("Назва легкового автомобіля: ");
        return super.getCarName();
    }

    @Override
    public double getCarSpeed() {
        System.out.print("Швидкість легкового автомобіля: ");
        return super.getCarSpeed();
    }

    @Override
    public double getFuelConsuption() {
        System.out.print("Витрати палива легкового автомобіля: ");
        return super.getFuelConsuption();
    }

    @Override
    public double getAmountOfCargo() {
        System.out.print("Вага можливого вантажу легкового автомобіля: ");
        return super.getAmountOfCargo();
    }

    @Override
    public int getNumberOfPassengers() {
        System.out.print("Кількість пасажирів легкового автомобіля: ");
        return super.getNumberOfPassengers();
    }

    @Override
    public String getPolution() {
        System.out.print("Забруднення повітря легковим автомобілем: ");
        return super.getPolution();
    }
}

class Truck extends Car {

    public Truck(String carName, double maxCarSpeed, double fuelConsuption, double amountOfCargo, int numberOfPassengers, String environmentalPollution) {
        super(carName, maxCarSpeed, fuelConsuption, amountOfCargo, numberOfPassengers, environmentalPollution);
    }

    @Override
    public String getCarName() {
        System.out.print("Назва вантажного автомобіля: ");
        return super.getCarName();
    }

    @Override
    public double getCarSpeed() {
        System.out.print("Швидкість вантажного автомобіля: ");
        return super.getCarSpeed();
    }

    @Override
    public double getFuelConsuption() {
        System.out.print("Витрати палива вантажного автомобіля: ");
        return super.getFuelConsuption();
    }

    @Override
    public double getAmountOfCargo() {
        System.out.print("Вага можливого вантажу вантажного автомобіля: ");
        return super.getAmountOfCargo();
    }

    @Override
    public int getNumberOfPassengers() {
        System.out.print("Кількість пасажирів вантажного автомобіля: ");
        return super.getNumberOfPassengers();
    }

    @Override
    public String getPolution() {
        System.out.print("Забруднення повітря вантажним автомобілем: ");
        return super.getPolution();
    }
}