package quiz;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money, num = 0;
		System.out.print("����� �����ϼ��� >>>");
		money = sc.nextInt();
		for(; ;) {
			System.out.println("=====Ŀ�� ���Ǳ� =====");
			System.out.println("1. Ŀ��(200)\t 2.���ھ�(250)\t 3.��ȯ\t 4.����");
			System.out.print("�޴��� �����ϼ��� >>>");
			num = sc.nextInt();
			if(num == 4) {
				break;
			}else if((num == 1 && money < 200) || (num == 2 && money< 250) ){
					System.out.println("����� �����մϴ�.\n");
				}
				else if(num == 1){
					System.out.println("���ְ� �弼��\n");
					money -= 200;
				}
				else if(num == 2){
					System.out.println("���ְ� �弼��\n");
					money -= 250;
				}
				else if(num == 3){
					System.out.println("�Ž����� : "+ money);
					money = 0;
				}
				else{
					System.out.println("�߸��Է��ϼ̽��ϴ�.\n\n");
				}
			}
			System.out.println("���α׷� ����!!!");
		
}
}
