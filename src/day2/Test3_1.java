package day2;

public class Test3_1 {

	public static void main(String[] args) {
		// 문제4) 50에서 100까지 자연수중에서 9의 배수의 개수를 출력 # 답 : 6 (54,63,72,81,90,99)
		int count = 0;
		for(int i = 50; i < 101; i++) {
			if(i % 9 == 0)
				count++;
		}
		System.out.println("9의 배수 (50 ~ 100사이): " + count);
		
		// 문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 답 : 980
		for (int j = 1000; j >= 1; j--) {
			if(j % 28 == 0) {
				System.out.println("28의 배수중 가장 큰 세자리 수 : " + j);
				break;
			}
				
			
		}
		
		// 문제6) 8의 배수를 작은수부터 5개 출력 ==> 답 : 0,8,16,24,32
		for(int k = 1; k < 6; k++) {
			System.out.println(8 * k);
		}

	}

}
