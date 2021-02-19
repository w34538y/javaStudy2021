package day5;

import java.util.Arrays;

public class Test4_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,0,0,0,0};
		int b[] = {2,3,1,0,4};

		// arr 배열에 10 부터 10씩 증가하면서10~50을 저장 
		// 조건 ) b의 값의 순서대로 저장 
		// 예) b의값은  2,3,1,0,4,  ==>  {30,40,20,10,50}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10;
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = b[i] * arr[i] + arr[i];
		}
		
		System.out.println(Arrays.toString(b));
	}

}
