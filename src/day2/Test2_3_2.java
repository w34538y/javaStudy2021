package day2;

public class Test2_3_2 {

	public static void main(String[] args) {
		int n = 24;
		for(int i = 1; i < n + 1; i++) {
			if (n % i == 0)
				if(i % 2 == 0)
					System.out.println(i + " ");
		}

	}

}
