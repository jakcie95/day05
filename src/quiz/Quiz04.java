package quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		//1~10사이의 숫자만 입력받아 1부터 입력받은 수까지의 합을 구하시오
		//10~20사이의 숫자만 입력받아 1부터 입력받은 수까지의 합을 구하시오
		Scanner sc = new Scanner(System.in);
		int i =0;
		int sum = 0;
		while(true) {
			System.out.println("숫자 입력(1~10) : ");
			i = sc.nextInt();
			if(i >= 1 && i <= 10) 
				break;
			System.out.println("잘못 입력 하셨습니다. 다시");
			}
		for(int j =0; j <= i; j++) {
			sum= sum+=j;
		}
		System.out.println("입력받은 수까지의 합 : " +sum);
		
		int k =0;
		int sum1 = 0;
		while(true) {
			System.out.println("숫자 입력(10~20) : ");
			k = sc.nextInt();
			if(k >= 10 && k <= 20) 
				break;
			System.out.println("잘못 입력 하셨습니다. 다시");
			}
		for(int e =0; e <= k; e++) {
			sum1= sum1+=e;
		}
		System.out.println("입력받은 수까지의 합 : " +sum1);
		
		
}
}









