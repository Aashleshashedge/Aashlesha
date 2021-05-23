package SamplePackage;

	import java.util.ArrayList;

	public class ExceptionHandling {

		public static void main(String[] args) {
			ArrayList<String> arrayList = new ArrayList<>();
			try {
				arrayList.add("Aashlesha");
				arrayList.add("Isha");
				exceptionFunction(arrayList);
			} catch (IndexOutOfBoundsException ex) {
				System.out.println("Array Index Out Of Bound Exception" + ex);
			} catch (Exception ex) {
				System.out.println("Some Other Exception" + ex);
			} finally {
				for (int i = 0; i < arrayList.size(); i++) {
					System.out.println(arrayList.get(i));
				}
			}
		}

		static ArrayList<String> exceptionFunction(ArrayList<String> arrayList) throws Exception {

			arrayList.add(4, "Test");// IndexOutOfBoundException
//			int res = 1 / 0; // DivideByZeroException
			// Code After this line wont run

			arrayList.add(3, "something");
			return arrayList;
		}

	}


