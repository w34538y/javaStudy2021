package day2;

public class Test2_3_3 {

	public static void main(String[] args) {
		int n = 18, m = 21;
		int count_n = 0, count_m = 0;
		for(int i = 1; i < n + 1; i++) {
			if (n % i == 0)
				count_n++;
		}
		for(int j = 1; j < m + 1; j++) {
			if (m % j == 0)
				count_m++;
		}
		System.out.println(n+"의 약수의 갯수와 "+ m +"의 약수의 갯수의 합 : " + count_n + count_m);
	}

}
