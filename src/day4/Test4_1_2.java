package day4;

import java.util.Arrays;

public class Test4_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {10, 20, 30, 40, 50};
		int b[] = {10, 20, 3, 5};
		
		//문제) arr 안에 b의 값이 있으면 0으로 변경
		// 예) arr = {0,0,30,40,50};
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				if(arr1[i] == b[j]) {
					arr1[i] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		

	}

}
