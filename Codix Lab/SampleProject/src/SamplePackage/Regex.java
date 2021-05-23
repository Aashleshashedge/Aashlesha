package SamplePackage;

	import java.util.Scanner;
public class Regex{
		public static void main(String[] args) {
			System.out.println("Please, Enter Your Phone Number:");
			String phoneNumber = new Scanner(System.in).nextLine();
			Boolean regexMatched = phoneNumber.matches("^\\s*(?:\\+?(\\d{1,3}))?[-. (]*(\\d{3})[-. )]*(\\d{3})[-. ]*(\\d{4})(?: *x(\\d+))?\\s*$");
			if (regexMatched)
				System.out.println("Validation successfull");
			else
				System.out.println("Validation Failed Please Enter valid Phone Number");
		}

	}


