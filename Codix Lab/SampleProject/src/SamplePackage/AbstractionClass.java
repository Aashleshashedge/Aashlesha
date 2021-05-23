package SamplePackage;

public class AbstractionClass {

	int fuel = 20;
	int maxFuelCapacity = 25;

	public static void main(String[] args) {
		AbstractionClass car = new AbstractionClass();
		car.fuelCar();
		car.fuelCar();
		car.fuelCar();
		car.fuelCar();
		car.fuelCar();
		car.fuelCar();
		car.runCar();
	}

	void fuelCar() {
		if (maxFuelCapacity > fuel) {
			fuel += 1;
			System.out.println("Fuel: " + fuel);
		} else {
			System.out.println("Fuel Capacity is reached: " + fuel);
		}
	}

	void runCar() {
		for (int i = fuel; i > 0; i--) {
			if (i > 1) {
				fuel--;
				System.out.println("Fuel: " + fuel);
			} else {
				System.out.println("Please Fuel Up Car ");
				break;
			}
		}
	}

}