import java.util.Scanner;

public class Coordinates1
{

	public static void main(String[] args)
	{

		//(50,50)�� ��ǥ
		int x1 = 50;
		int y1 = 50;
		
		//(100,100)�� ��ǥ
		int x2 = 100;
		int y2 = 100;
		
		//���� �Է¹��� ��ǥ
		int x3 = 0;
		int y3 = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ� >> ");
		
		x3 = input.nextInt();
		y3 = input.nextInt();
		
		if( (x3>=x1) && (x3<=x2) && (y3>=y1) && (y3<=y2))
			System.out.println("�簢�� �ȿ� ���� �ֽ��ϴ�");
		else
			System.out.println("�簢�� �ȿ� ���� �����ϴ�");
	}
}
