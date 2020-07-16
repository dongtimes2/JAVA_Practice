import java.util.Scanner;

public class Calculator {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하시오");
		int x = input.nextInt();
		
		System.out.println("연산자를 입력하시오");
		char c = input.next().charAt(0);
		
		System.out.println("두 번째 숫자를 입력하시오");
		int y = input.nextInt();
		
		switch(c)
		{
			case '+':
				System.out.println("결과: " + (x+y));
				break;
			case '-':
				System.out.println("결과: " + (x-y));
				break;
			case '*':	
				System.out.println("결과: " + (x*y));
				break;
			case '/':
				System.out.println("결과: " + (x/y));
				break;
			default:	
				System.out.println("올바르지 않은 연산자");
				break;
		}
	}
}
