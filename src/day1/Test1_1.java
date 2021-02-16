package day1; //자바1 테스트 문제

import java.util.Scanner;

public class Test1_1 {
	public static void main(String[] args) {
		// 문제) 시험점수3개를 입력받고 학점출력 
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third =  sc.nextInt();
		sc.close();
		
		// 조건 1) 3과목의 평균을 가지고 점수를 매긴다.
		int avg = (first + second + third) / 3;
		
		// 조건 2) 3과목의 평균이 100~90 ==> A
		if(avg <= 100 && avg >= 90) {
			System.out.print("A");
		}
		// 조건 3) 3과목의 평균이 89~80 ==> B
		else if(avg <= 89 && avg >= 80) {
			System.out.print("B");
		}
		// 조건 4) 3과목의 평균이 79~70 ==> C
		else if(avg <= 79 && avg >= 70) {
			System.out.print("C");
		}
		// 조건 5) 69이하                      ==> 재시험 
		else if (avg <= 69){
			System.out.println("재시험");
		}
		
		
		// 추가조건) 각점수대별로 끝자리가 7점 이상은 + 가붙는다. 
		// 예) 98 ==> A+
		if(avg <= 100 && avg >= 97) {
			System.out.println("+");
		}
		// 예) 89 ==> B+
		else if(avg <= 89 && avg >= 87) {
			System.out.println("+");
		}
		// 예) 79 ==> C+
		else if(avg <= 79 && avg >= 77) {
			System.out.println("+");
		}
	}
}
