import java.util.Scanner;

public class gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ �н�");
		System.out.print("���ϴ� ���� �Է��ϼ��� : ");
		
		a = input.nextInt();
		
		System.out.println();
	
		for(int i=1; i<=9; i++) {
			b = a*i;
			System.out.println(a+" X "+i+" = "+b);			
			
		}			
	}
}