package day2;

public class Test2_2_33 {

	public static void main(String[] args) {
		int price = 24600;

		System.out.println("옷의 가격 : " + price);
		while (price % 1000 != 0) {
			price += 100;
		}
		int money_count = price / 1000;
		System.out.println("필요한 1000원권의 장수 : " + money_count+ "장");

	}

}
