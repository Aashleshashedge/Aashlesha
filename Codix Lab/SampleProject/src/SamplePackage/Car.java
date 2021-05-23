package SamplePackage;

public class Car {
	String carColor = "gray";
	//static variable can be used from any type of methods 
	static String engine = "V1";

	Car() {}

	Car(String tempEngine) {
		engine = tempEngine;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car newCar = new Car();
		newCar.printCarColor();
		Car.printCarEngine();

		Car newCar2 = new Car("V2");
		newCar2.printCarColor();
		Car.printCarEngine();

		Car newCar3 = new Car();
		newCar3.printCarColor();
		Car.printCarEngine();

		//Modifier newModifier = new Modifier();
		//System.out.println(newModifier.defaultVariable);
	//	System.out.println(newModifier.publicVariable);
//		System.out.println(newModifier.privateVariable);
		//newModifier.printPrivateVariable();
		//System.out.println(newModifier.protectedVariable);

	}

	void printCarColor() {
		System.out.println("Car color: " + carColor);
	}

	static void printCarEngine() {
		System.out.println("Engine: " + engine);
	}


}
