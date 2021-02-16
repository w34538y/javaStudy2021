package day3;
// 문제5) 연필 42자루와 지우개 28개를 최대한 많은 학생에가 남김없이 똑같이 나누어 주려고합니다
// 몇명까지 나누어 줄수있는지 출력

public class Test3_2_5 {

	public static void main(String[] args) {
		int pencil = 42, eraser = 28;

		for (int i = 100; i > 1; i--) {
			if(pencil % i == 0 && eraser % i == 0) {
				System.out.println("최대로 나눠 줄 수 있는 인원수: " + i);
				break;
			}
		}

	}

}