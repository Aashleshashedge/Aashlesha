package SamplePackage;

public class EncapsulationClass {
	int speed = 0;
	String color = "black";

	public static void main(String[] args) {
		EncapsulationClass car = new EncapsulationClass();
		car.color = "green";
		System.out.println("Car Current Speed: "+ car.speed);
		car.accelrateSpeed();
		car.accelrateSpeed();
//		car.breakCar();
		car.stopCar();
	}

	void accelrateSpeed() {
		speed = speed + 1;
		System.out.println("Accelerated Speed: "+speed);
	}

	void breakCar() {
		speed--;
		System.out.println("Break Speed: "+speed);
	}

	void stopCar() {
		speed = 0;
		System.out.println("Car Stopped & speed is "+speed);
	}

}
