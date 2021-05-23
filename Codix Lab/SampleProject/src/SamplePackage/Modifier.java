package SamplePackage;

public class Modifier {

		//public
		public int publicVariable = 10;
		
		//default
		int defaultVariable = 11;
		
		//private 
		private int privateVariable = 12;
		
		//protected
		protected int protectedVariable = 13;

		public static void main(String[] args) {
			
			Modifier modifier = new Modifier();
			
			System.out.println(modifier.defaultVariable);
			
			System.out.println(modifier.publicVariable);
			
			System.out.println(modifier.privateVariable);
			
			System.out.println(modifier.protectedVariable);
		}

		public void printPrivateVariable() {
			System.out.println(privateVariable);
		}
	}


