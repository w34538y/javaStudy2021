package day3;

public class Test3_2_4 {

	public static void main(String[] args) {
		int n = 25, m = 75;

		for (int i = 100; i > 1; i--) {
			if(n % i == 0 && m % i == 0) {
				System.out.println(i);
				break;
			}
		}
	}

}
