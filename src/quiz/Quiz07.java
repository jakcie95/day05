package quiz;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money, num = 0;
		System.out.print("요금을 투입하세요 >>>");
		money = sc.nextInt();
		for(; ;) {
			System.out.println("=====커피 자판기 =====");
			System.out.println("1. 커피(200)\t 2.코코아(250)\t 3.반환\t 4.종료");
			System.out.print("메뉴를 선택하세요 >>>");
			num = sc.nextInt();
			if(num == 4) {
				break;
			}else if((num == 1 && money < 200) || (num == 2 && money< 250) ){
					System.out.println("요금이 부족합니다.\n");
				}
				else if(num == 1){
					System.out.println("맛있게 드세요\n");
					money -= 200;
				}
				else if(num == 2){
					System.out.println("맛있게 드세요\n");
					money -= 250;
				}
				else if(num == 3){
					System.out.println("거스름돈 : "+ money);
					money = 0;
				}
				else{
					System.out.println("잘못입력하셨습니다.\n\n");
				}
			}
			System.out.println("프로그램 종료!!!");
		
}
}
