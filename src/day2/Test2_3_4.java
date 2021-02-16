package day2;

public class Test2_3_4 {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 50; i < 101; i++) {
			if(i % 9 == 0)
				count++;
		}
		System.out.println("9의 배수 (50 ~ 100사이): " + count);

	}

}
