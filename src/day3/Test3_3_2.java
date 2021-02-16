package day3;

public class Test3_3_2 {

	public static void main(String[] args) {
		int soo = 4, hyung =  6;
		int next_Day = 3;
		
		roop: for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if(soo * i == hyung * j) {
					next_Day +=  soo * i;
					break roop;
				}
			}
			
		}
		System.out.println("다음에 보는 날 : 4월 " + next_Day + "일");
	}

}
