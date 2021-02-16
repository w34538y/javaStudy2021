package day3;

public class Test3_2_3 {

	public static void main(String[] args) {
		int n = 6, m = 8;

		for (int i = 10; i > 1; i--) {
			if(n % i == 0 && m % i == 0) {
				System.out.println(i);
				break;
			}
		}

	}

}
