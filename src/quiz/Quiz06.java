package quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String id, password = null;
		String saveId = null,savePassword = null;
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.나가기");
			a = sc.nextInt();
			if(a ==3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		switch(a) {
			case 1:
			System.out.print("아이디 입력 : ");
			id = sc.next();
			System.out.print("비밀번호 입력 : ");
			password = sc.next();
			if(id.equals(saveId) && password.equals(savePassword))
			System.out.println("인증 성공 !!!");
			else
			System.out.println("인증 실패 !!!");
			break;
			
			case 2:
			System.out.print("저장할 아이디 입력 : ");
			saveId = sc.next();
			System.out.print("저장할 비밀번호 입력 : ");
			savePassword = sc.next();
			System.out.print("가입 완료 !!!");
		}
		}

}
}
