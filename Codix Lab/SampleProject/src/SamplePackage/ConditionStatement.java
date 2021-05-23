package SamplePackage;

public class ConditionStatement {

	public static void main(String[] args) {
		int i = 1;

		// If Statement
		if(i < 10) 
			System.out.println("i is less than 10: " + i);

		i = 11;
         // If Else Statement
		if(i < 10) 
			System.out.println("i is less than 10: "+ i);
		else 
			System.out.println("i is greater than 10: " + i);

         // Switch Statement
		int percentage = 61;
		switch(percentage){
		case 80 :{
			System.out.println("I will go for Science");
			break;
		}
		case 70:{
			System.out.println("I will go for Commerce");
			break;
		}
		case 60:{
			System.out.println("I will go for Arts");
			break;
		}
		default:{
			System.out.println("I dont know");
			break;
		}
		}

		// Else if Ladder
		if(percentage > 60 && percentage <= 70) 
			System.out.println("I will go for Arts");
		else if(percentage > 70 && percentage <= 80) 
			System.out.println("I will go for Commerce");
		else if(percentage > 80) 
			System.out.println("I will go for Science");
		else
			System.out.println("I dont know");
	}

}
