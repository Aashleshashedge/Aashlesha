package SamplePackage;

public class InterfaceImplementation  {

		public static void main(String[] args) {
			
			InterfaceImplementation obj = new InterfaceImplementation();
			
			System.out.println(obj.add(1, 2));
			
			System.out.println(obj.add((float)3.0,(float) 5.0));
			
			System.out.println(obj.subtract((float)3.0,(float) 8.0));
			
			System.out.println(obj.subtract(3,4));
		}
		public int subtract(int a, int b) {
			return a-b;
		}
        public float subtract(float a, float b) {
			return a-b;
		}
        public int add(int a, int b) {
			return a+b;
		}
        public float add(float a, float b) {
			return a+b;
		}
        }
