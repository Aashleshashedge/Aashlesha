package SamplePackage;

public class StaticNonstatic {

	public static void main(String[] args) {

		int a =2;
		int b =3;
		int c = add(a,b);
		System.out.println("c: "+ c);

		a = 5;
		b= 4;
		int d = add(a,b);
		System.out.println("d: "+ d);

	}

	//scope static/nonstatic return type name(parameters)
	private static int add(int a, int b) {
		// function/method body
		int d = a + b; 
		d = d - a;
		d = d + a;
		return d;
	}

}
