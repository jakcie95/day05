package quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		//�μ��� �Է¹޾� �Է¹��� �� ������ ���� ���ϼ���
				//�Է� �� : 1, 10 -> 55. 10, 1 -> 55
		
		int num1, num2, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�μ��Է�");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int n1 =num1;
		while(n1 <= num2) {
			sum+=n1;
			n1++;
		}
		while(num2 <= num1) {
			sum+=num2;
			num2++;
		}
		System.out.println(sum);
		System.out.println("�� �� �Է�");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sum =0;
		int max, min = 0;
		if(num1 > num2) {
			max = num1; min = num2;
		}else {
			max = num2; min = num1;
		}
		while(min <= max) {
			sum +=min;
			min++;
		}
		System.out.println(sum);
		
}
}
