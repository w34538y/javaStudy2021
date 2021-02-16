package day3;
//문제2 6과 8의 공약수를 모두 출력 

public class Test3_2_2 {

	public static void main(String[] args) {
		int n = 6, m = 8;

		for (int i = 1; i < 10; i++) {
			if(n % i == 0 && m % i == 0) {
				System.out.println(i);
			}
		}

	}

}
