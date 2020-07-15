import java.util.Scanner;

public class Coordinates2
{

	public static void main(String[] args)
	{

		//(50,50)의 좌표
		int x1 = 50;
		int y1 = 50;
		
		//(100,100)의 좌표
		int x2 = 100;
		int y2 = 100;
		
		//새로 입력받을 좌표1
		int x3 = 0;
		int y3 = 0;
		
		//새로 입력받을 좌표2
		int x4 = 0;
		int y4 = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("두 점 (x1,y1), (x2,y2)의 좌표를 입력하시오 >>");
		
		x3 = input.nextInt();
		y3 = input.nextInt();
		x4 = input.nextInt();
		y4 = input.nextInt();
		
		if( ((x3>=x1) && (x3<=x2) && (y3>=y1) && (y3<=y2)) || ((x4>=x1) && (x4<=x2) && (y4>=y1) && (y4<=y2)) )
			System.out.println("사각형이 겹칩니다");
		else
			System.out.println("사각형이 겹치지 않습니다");
	}
}
