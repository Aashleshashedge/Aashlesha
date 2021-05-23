package SamplePackage;

public class Recursion {

		public static void main(String[] args) {
			recursiveFunction2(10);
		}

		static void recursiveFunction(int i) {
			if (i <= 0)
				return;
			else {
				System.out.println(i);
				recursiveFunction(i--); // Tail Recursion
			}
		}

		static void recursiveFunction2(int i) {
			if (i > 0) {
				recursiveFunction2(--i); // Head Recursion
				System.out.println(i);
			} else
				return;
		}

	}


