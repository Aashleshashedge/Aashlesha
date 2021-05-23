package SamplePackage;

public class ParentClass {
	
	public static void main(String[] args) {
	}

	protected int speed = 0;
		int maxSpeed = 100;
		int minSpeed = 0;
		String engine = "V1";
		String color = "black";

		void accelrateSpeed() {
			speed = speed + 1;
			System.out.println("Accelerated Speed: "+speed);
		}

		void brakeCar() {
			speed--;
			System.out.println("Brake Speed: "+speed);
		}

		void stopCar() {
			speed = 0;
			System.out.println("Car Stopped & speed is "+speed);
		}

		void setEngine(String engineName) {
			engine = engineName;
		}
	}

