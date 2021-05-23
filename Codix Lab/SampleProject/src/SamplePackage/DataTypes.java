package SamplePackage;

public class DataTypes {

	public DataTypes() {
		
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//types of variables
		//data types
		// final / constant
				final int i = 0;
		System.out.println("Final/Const Int:"+i);
		int j = 0;
		
		//int data types
		j = 1;
		System.out.println("Normal int"+j);
		
		//char data types
		char something ='c';
		System.out.println("char:" + something);
		
		//boolean data type
		Boolean some = true; 
		System.out.println("Boolean :" + some);
		
		 //float data Type
		float tempFloat = (float) 2.23451234567890123456789034567812345678934567893456789;
		System.out.println("Float : " +tempFloat);
		
		//double data types
		double tempDouble = (double) 2.212345678356890; 
		System.out.println("Double : " + tempDouble);
		
		/**
		 * Types Casting
		 * 1. Narrow Casting
		 * 2. Widening Casting
		 */
		// Narrow Casting Example
		
		// Narrow Casting double -> float
		tempFloat = (float) tempDouble; 
		System.out.println("Narrow Casting double -> float : " + tempFloat);
		
		 // Narrow Casting float -> int      //kuthe s
		
		// Widening Casting Example
		// Widening Casting int -> float 
				float tempFloat2 = j;
				System.out.println("Widening Casting int -> float : "+tempFloat2);
				// Widening Casting float -> double
				double tempDouble2 = tempFloat2;
				System.out.println("Widening Casting float -> double :" + tempDouble2 );

				/**
				 * Operators Example
				 */
				int k = 3;
				int l = 4;
				int s = k %l;
				s+=2;
				s = s+2;
				s++; // s++ is equivalent to s=s+1
				System.out.println(s > k); //boolean output from operators
				System.out.println(s > k && s < k);//boolean output from operators

				String sampleSting = "String with Escape Char - \' \"";
				System.out.println(sampleSting);
				
				System.out.println(sampleSting.toLowerCase());
				System.out.println(sampleSting.toUpperCase());
				System.out.println(sampleSting.toUpperCase().indexOf("S"));
				System.out.println(sampleSting.toUpperCase().lastIndexOf("S"));
				//t
				System.out.println("TAB ADDED HERE: \tAFTER TAB");
                // \n
				System.out.println("NEW LINE ADDED \nTHIS IS NEW LINE");
     }

}
