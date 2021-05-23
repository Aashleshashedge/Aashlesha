package SamplePackage;

import java.util.ArrayList;

public class LambdaFunction {
	
		public static void main(String[] args) {
			ArrayList<String> arrayList = new ArrayList<>();
			arrayList.add("Aashlesha");
			arrayList.add("Isha");
			arrayList.add("Aashlesha 2");
			arrayList.add("Isha3");
			arrayList.add(2, "Some Name"); // inserting element in between 2 elements

			ArrayList<String> arrayList2 = new ArrayList<>();

			arrayList.forEach((word) -> {
				if(word.contains("Isha"))
					arrayList2.add(word);
				}
			);

			arrayList2.forEach((word) -> System.out.println(word));

		}
	}


