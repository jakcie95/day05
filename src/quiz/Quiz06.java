package quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String id, password = null;
		String saveId = null,savePassword = null;
		while(true) {
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.������");
			a = sc.nextInt();
			if(a ==3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		switch(a) {
			case 1:
			System.out.print("���̵� �Է� : ");
			id = sc.next();
			System.out.print("��й�ȣ �Է� : ");
			password = sc.next();
			if(id.equals(saveId) && password.equals(savePassword))
			System.out.println("���� ���� !!!");
			else
			System.out.println("���� ���� !!!");
			break;
			
			case 2:
			System.out.print("������ ���̵� �Է� : ");
			saveId = sc.next();
			System.out.print("������ ��й�ȣ �Է� : ");
			savePassword = sc.next();
			System.out.print("���� �Ϸ� !!!");
		}
		}

}
}
