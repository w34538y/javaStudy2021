package day2;

public class Test2_2_444 {

	public static void main(String[] args) {
		double population = 400000.00;
		double under19 = population * (35.00/100.00);
		double over40 = population * (25.00/100.00);
		double count = under19 - over40;
		System.out.println("19세이하인구 - 40세 이상인구 : "+ count);

	}

}
