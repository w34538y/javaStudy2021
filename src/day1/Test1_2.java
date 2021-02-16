package day1;

import java.util.Random;
import java.util.Scanner;

public class Test1_2 {

	public static void main(String[] args) {
		/*
		 * # 구구단 게임[2단계]
		 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 랜덤하게 저장한다.
		 * 2. 저장된 숫자를 토대로 구구단 문제를 출력한다.
		 * 예)	3 x 7 = ?
		 * 3. 문제에 해당하는 정답을 입력받는다.
		 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
		 */
		Random rand = new Random();
		int one = rand.nextInt(9) + 1;
		int two = rand.nextInt(9) + 1;
		int cor_ans = one * two;
		System.out.println(one + "*" + two + "= ?");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		if(cor_ans == input)
			System.out.println("정답!");
		else
			System.out.println("땡!");
	}

}
