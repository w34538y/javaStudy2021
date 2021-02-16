package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Test4_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int game[] = {0, 2, 0, 2, 8, 0, 0, 3, 3};
		int temp[] = new int[9];
		int temp2[] = new int[9];
		int temp3[] = new int[9];
		

		System.out.println("1) left / 2) right ");
		Scanner sc = new Scanner(System.in);
		int check = sc.nextInt();
		sc.close();
		// 1)left , 2)right
		
		//문제1)번호를 입력받고 각방향으로 숫자를모으시요.
		//조건) 만약에 같은숫자2개가 붙었을경우는 서로 더해진다.
		// 아래 2단계출력 
		//예) left 
		//      1단계 :  {2,2,8,4,0,0,0,0,0}; 
		//      2단계 :  {4,8,4,0,0,0,0,0,0}; 2가 2개붙었으니 4가된다.
		
		if(check == 1) {
			
			int j = 0, k = 0;
			
			for(int i = 0; i < game.length; i++) {
				if(game[i] > 0) {
					temp[j] = game[i];
					j++; //1단계 처리 부분
				}
			}
			
			temp2 = Arrays.copyOf(temp, temp.length);
			
			for(int i = 0; i < temp2.length - 1; i++) {
				if(temp2[i] == temp2 [i + 1]) {
					temp2[i] *= 2;
					temp2[i + 1] = 0;
				}
				if(temp2[i] > 0) {
					temp3[k] = temp2[i];
					k++;
				}
				
			}
		}
		
		if(check == 2) {
			
			int j = game.length - 1, k = game.length - 1;
			
			for(int i = game.length - 1; i >= 0; i--) {
				if(game[i] > 0) {
					temp[j] = game[i];
					j--; //1단계 처리 부분
				}
			}
			
			temp2 = Arrays.copyOf(temp, temp.length);
			for(int i = temp2.length - 1; i >= 1; i--) {
				if(temp2[i] == temp2[i - 1]) {
					temp2[i] *= 2;
					temp2[i - 1] = 0;
				}
				if(temp2[i] > 0) {
					temp3[k] = temp2[i];
					k--;
				}
				
			}
		}
		
		
		System.out.println("1단계 : "+Arrays.toString(temp));
		System.out.println("2단계 : "+Arrays.toString(temp3));
		
	}

}
