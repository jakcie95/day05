package day05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int i =0;
		//for(;i<3;) {
		while(i<3) {
			System.out.println(i);
			i++;
		}
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		i = 0;
		while(true) {// == for(;;)
			System.out.println("수 입력(1~100)");
			i = sc.nextInt();
			if(i >= 1&& i <= 100)
				break;
			System.out.println("잘못 입력. 다시");
		}
		for(int j=1; j<=i; j++)
			sum+=j;
		System.out.println("입력받은 수까지의 합 : " +sum);
}
}







