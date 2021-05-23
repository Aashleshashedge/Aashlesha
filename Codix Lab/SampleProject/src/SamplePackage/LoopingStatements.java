package SamplePackage;

public class LoopingStatements {

	public LoopingStatements() {
		
	}

	public static void main(String[] args) {
		//for(int i = 0;i < 20; i++) {
			//System.out.println(i);
		//}
		int i = 0;
	while(i < 10) {
		System.out.println(i);
		i++;
	}
	//while
	int j = 0;
	int k = 10;
	while(j < k) {
		System.out.println("j:" +j +"k:"+k);
		j++;
		k--;
	}
	//do while
		int l = 0;
		do {
			System.out.println(l);
			l++;
		}while(l< 20);
	}
	

}
