package day3;

//문제1 7의 배수를 차례대로 출력했을때 8번째 배수를 출력
public class Test3_2_1 {

	public static void main(String[] args) {
		int n = 7;
		int result = 0;
		for(int i = 1; i < 9; i++) {
			if(i == 8)
				result = n * i;
		}
		
		System.out.println("7의 배수 8번째는 " + result);

	}

}
