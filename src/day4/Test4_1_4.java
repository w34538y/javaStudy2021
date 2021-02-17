package day4;

import java.util.Arrays;

public class Test4_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int darr[][] = {
				{10,20,30},
				{40,50,60},
				{70,80,90},
		};
		int b [] = {10,2,54,90,50};
		// b 에 arr 의 값이 있으면 0으로 변경 
		
		//예) b ==> {0,2,54,0,0};
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					if(darr[j][k] == b[i]) {
						b[i] = 0;
					}
				}
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
