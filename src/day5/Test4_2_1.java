package day5;

import java.util.Arrays;
import java.util.Scanner;

public class Test4_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {5,5,6,8,2,6};
		int temp[] = new int[6];
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		sc.close();
		int cnt = 0;
		int j = 0;
		//  값을 입력받고 삭제 
		// 조건) 만약에 같은값이 있으면 전부 삭제 
		// 예) 2 ==> 5,5,6,8,6
		// 예) 5 ==> 6,8,2,6
		for(int i = 0; i < data.length; i++) {
			if(data[i] != input) {
				temp[j] = data[i];
				j++;
				cnt++;
			}
		}
		int output [] = new int[cnt];
		
		for(int i = 0; i < cnt; i++) {
			output[i] = temp[i];
		}
		System.out.println(Arrays.toString(output));
	}

}
