import java.util.Scanner;

public class Calculator {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("ù ��° ���ڸ� �Է��Ͻÿ�");
		int x = input.nextInt();
		
		System.out.println("�����ڸ� �Է��Ͻÿ�");
		char c = input.next().charAt(0);
		
		System.out.println("�� ��° ���ڸ� �Է��Ͻÿ�");
		int y = input.nextInt();
		
		switch(c)
		{
			case '+':
				System.out.println("���: " + (x+y));
				break;
			case '-':
				System.out.println("���: " + (x-y));
				break;
			case '*':	
				System.out.println("���: " + (x*y));
				break;
			case '/':
				System.out.println("���: " + (x/y));
				break;
			default:	
				System.out.println("�ùٸ��� ���� ������");
				break;
		}
	}
}
