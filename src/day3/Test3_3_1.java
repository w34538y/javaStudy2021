package day3;

public class Test3_3_1 {

	public static void main(String[] args) {
		int n = 8, m = 12;
		
		roop: for (int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if(n * i == m * j ) {
					System.out.println(n * i);
					break roop;
		
				}
			}
			
		}

	}

}
