import java.util.Scanner;

public class Game369
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("1~99 ������ ������ �Է��Ͻÿ� >> ");
		int number = input.nextInt();
		
		if(number<10)
			if(number == 3 || number == 6 || number == 9)
				System.out.println("�ڼ� ¦");
			else 
				System.out.println("�ڼ� X");
		
		else
		{
			int x = number / 10; //10�� �ڸ� �� 
			int y = number % 10; //1�� �ڸ� �� 
			
			boolean a = false; //10�� �ڸ� ���� 3�� ����� ���
			boolean b = false; //1�� �ڸ� ���� 3�� ����� ���
			
			if(x == 3 || x == 6 || x == 9)
				a = true;
			if(y == 3 || y == 6 || y == 9)
				b = true;
			
			if(a || b)
				if(a && b)
					System.out.println("�ڼ� ¦¦");
				else
					System.out.println("�ڼ� ¦");
			else
				System.out.println("�ڼ� X");
		}
	}
}
