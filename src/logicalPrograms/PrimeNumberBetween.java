package logicalPrograms;

public class PrimeNumberBetween {

	public static void main(String[] args) {
		//int count = 0; dont write count here
		for(int i = 1 ; i < 10; i++) {
		int count = 0;
			for(int j = 1; j<=10; j++) {
				if(i%j==0) {
					count++;  //2
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}
	}
}
