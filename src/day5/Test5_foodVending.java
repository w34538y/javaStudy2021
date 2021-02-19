package day5;

import java.util.Scanner;

public class Test5_foodVending {
	
		// 식권 자판기 프로그램 		
		// 1) 관리자   2) 사용자 
		//관리자 ==> 1) 식권충전   2) 잔돈 충전 	 3)뒤로가기
		//사용자 ==> 1) 구입 ==> ==> 입금 금액 입력 ==> 구매 매수 입력  ==> 잔돈출력 	
	    //	       2)뒤로가기
		// 조건 ) 예) 잔돈이 7600원이다. 5000원권이 없으면 1000원짜리 7장출력 
		//화면 
		// 식권 가격 : 3200원 
		// 식권 	  : ??매  (매진시 매진) 
		// 50000원 : ?? 매  	// 10000원 : ?? 매	// 5000원 : ?? 매
		// 1000원 : ?? 매		//  500원 : ?? 개	  	//  100원 : ?? 개 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] money   = {50000, 10000, 5000, 1000, 500, 100};
		int[] charges = {    1,     1,    1,    1,   5,  10};
		
		int tickets = 5;		// 식권 개수
		int price = 3200;		// 식권 가격
		
		while(true) {
			
			System.out.println("[1]관리자");
			System.out.println("[2]사용자");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				while(true) {
					System.out.println("1)식권충전");
					System.out.println("2)잔돈충전");
					System.out.println("3)뒤로가기");
					
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					
					if(choice == 1) {
						System.out.println("------- 식권 충전 기능입니다 -------");
						System.out.println("충전할 매수를 입력 : ");
						
						int update_tickets = scan.nextInt();
						tickets += update_tickets;
						
						System.out.println("충전된 식권 수 :" + update_tickets +" 총 식권 수 : "+ tickets);
					}
					else if(choice == 2) {
						System.out.println("------ 잔돈 충전 기능입니다 ------");
						System.out.println("1)50000원권 충전");
						System.out.println("2)10000원권 충전");
						System.out.println("3)5000원권 충전");
						System.out.println("4)1000원권 충전");
						System.out.println("5)500원권 충전");
						System.out.println("6)100원권 충전");
						
						int sel_money = scan.nextInt();
						System.out.println(money[sel_money - 1]+"원권을 충전합니다. 충전할 매수를 입력해주세요 : ");
						int sel_charge = scan.nextInt();
						charges[sel_charge - 1] += sel_charge;
						
						System.out.println("충전된 권종 :" + money[sel_money - 1] +" 총 매수 : "+ charges[sel_charge - 1]);
					}
					else if(choice == 3) {
						break;
					}
				}
				
			}
			else if(sel == 2) {
				while(true) {
					System.out.println("1)구입");
					System.out.println("2)뒤로가기");
				
					System.out.print("메뉴 선택 : ");
					
					int choice = scan.nextInt();
					
					if(choice == 1) {
						System.out.println("식권 가격: " + price);
						if(tickets != 0)
							System.out.println("주문 가능 식권 갯수 : " + tickets);
						else
							System.out.println("주문 가능 식권 갯수 : 매진" );
						
						System.out.println("식권을 구매합니다. 금액을 넣어주세요 : ");
						int count_money = scan.nextInt();
						System.out.println("구매할 매수를 입력해주세요 : ");
						int count_tickets = scan.nextInt();
						
						int return_money = count_money - (price * count_tickets);
						System.out.println("식권 "+ count_tickets + "장이 구매 되었습니다.");
						System.out.println("잔돈 : " + return_money);
						
						for (int i = 0; i < money.length; i++) {
							int count = 0;
							while(return_money / money[i] > 0) {
								count++;
								
								return_money -= money[i];
								if(count > charges[i])
									break;
							}
							System.out.println(money[i]+"원권 :" + count + "장");
						}
					}
					else if(choice == 2) {
						break;
					}
				}
			}
		}
	}

}
