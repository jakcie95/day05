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
			System.out.println("�� �Է�(1~100)");
			i = sc.nextInt();
			if(i >= 1&& i <= 100)
				break;
			System.out.println("�߸� �Է�. �ٽ�");
		}
		for(int j=1; j<=i; j++)
			sum+=j;
		System.out.println("�Է¹��� �������� �� : " +sum);
}
}







