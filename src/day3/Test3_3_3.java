package day3;

public class Test3_3_3 {

	public static void main(String[] args) {
		int x = 12, y = 8;
		int result = 0;
		roop: for(int i = 1; i < 10; i++) {
			for(int j = 1; i < 10; j++) {
				if(x * i == y * j) {
					result = i * j;
					System.out.println("필요한 종이 수 : " + result);
					break roop;
				}
			}
		}

	}

}
