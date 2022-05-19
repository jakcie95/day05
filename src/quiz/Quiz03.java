package quiz;

public class Quiz03 {

	public static void main(String[] args) {
		int a;
		for(a = 1; a <= 25; a++) {
			System.out.print(a + "\t");
			if(a%5 == 0) {
				System.out.println();
			}
		}

}
}
