package quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		//1~10������ ���ڸ� �Է¹޾� 1���� �Է¹��� �������� ���� ���Ͻÿ�
		//10~20������ ���ڸ� �Է¹޾� 1���� �Է¹��� �������� ���� ���Ͻÿ�
		Scanner sc = new Scanner(System.in);
		int i =0;
		int sum = 0;
		while(true) {
			System.out.println("���� �Է�(1~10) : ");
			i = sc.nextInt();
			if(i >= 1 && i <= 10) 
				break;
			System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ�");
			}
		for(int j =0; j <= i; j++) {
			sum= sum+=j;
		}
		System.out.println("�Է¹��� �������� �� : " +sum);
		
		int k =0;
		int sum1 = 0;
		while(true) {
			System.out.println("���� �Է�(10~20) : ");
			k = sc.nextInt();
			if(k >= 10 && k <= 20) 
				break;
			System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ�");
			}
		for(int e =0; e <= k; e++) {
			sum1= sum1+=e;
		}
		System.out.println("�Է¹��� �������� �� : " +sum1);
		
		
}
}









