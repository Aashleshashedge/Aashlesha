
package SamplePackage;


public class Control {

	
	public Control(){ 
		
	}

	
		public static void main (String[] args) {
		
int i = 1;
if(i< 10) {
	System.out.println("i is less than 10 :" + i);
}
i = 11;
if(i < 10)
	System.out.println("i is less than 10 :" + i);
else
	System.out.println("i is greater than 10 :" + i);
int percentage =  86;
switch(percentage) {
case 80:{
	System.out.println("I will go for science" );
	break;
	}
case 70:{
	System.out.println("I will go for commerce" );
	break;
	}
case 60:{
	System.out.println("I will go for arts" );
	break;
}
default:{

	System.out.println("i dont know" );
	break;
}
}
	}
	}
	

