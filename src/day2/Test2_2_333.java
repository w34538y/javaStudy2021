package day2;

public class Test2_2_333 {

	public static void main(String[] args) {
		double milk = 250;
		double am_milk = milk * (84.00/100.00);
		double pm_milk = milk - am_milk;
		System.out.println("오전에 팔린 우유 갯수 : " + am_milk);
		System.out.println("오후에 팔린 우유 갯수 : " + pm_milk);
		
	}

}
