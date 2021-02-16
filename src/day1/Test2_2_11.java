package day1;

public class Test2_2_11 {

	public static void main(String[] args) {
		int cucumber = 14, price = 500;

		while(cucumber % 3 != 0) {
			cucumber += 1;
		}
		int total_price = cucumber * price;
		System.out.println("오이 가격: "+total_price);

	}

}
