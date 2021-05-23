package SamplePackage;

public class BasicOOP {
	
		BasicOOP(){
			System.out.println("Initializing Object");
		}

		BasicOOP(int i){
			System.out.println("i:" + i);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			BasicOOP object = new BasicOOP();
			object.printSomething();

			BasicOOP object2 = new BasicOOP(10);
			object2.printSomething();
		}

		public void printSomething() {
			System.out.println("This Method is from BasicOOP");
		}

		public static void printSomething2() {
			System.out.println("This Method is from BasicOOP 2");
		}

	}

