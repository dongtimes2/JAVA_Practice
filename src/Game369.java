import java.util.Scanner;

public class Game369
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하시오 >> ");
		int number = input.nextInt();
		
		if(number<10)
			if(number == 3 || number == 6 || number == 9)
				System.out.println("박수 짝");
			else 
				System.out.println("박수 X");
		
		else
		{
			int x = number / 10; //10의 자리 수 
			int y = number % 10; //1의 자리 수 
			
			boolean a = false; //10의 자리 수가 3의 배수인 경우
			boolean b = false; //1의 자리 수가 3의 배수인 경우
			
			if(x == 3 || x == 6 || x == 9)
				a = true;
			if(y == 3 || y == 6 || y == 9)
				b = true;
			
			if(a || b)
				if(a && b)
					System.out.println("박수 짝짝");
				else
					System.out.println("박수 짝");
			else
				System.out.println("박수 X");
		}
	}
}
