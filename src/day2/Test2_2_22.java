package day2;

public class Test2_2_22 {

	public static void main(String[] args) {
		int student = 26, set_paper = 2, paper = 10, pPrice = 120;
		int total_paper = student * set_paper;
		while (total_paper % 10 != 0) {
			total_paper++;
		}
		int total_price = total_paper * paper * pPrice;

		System.out.println("총 금액 : " + total_price);
	}

}
