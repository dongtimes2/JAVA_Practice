import java.util.Scanner;
import java.util.Random;

public class UpDownGame
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random Rand = new Random();
		
		while(true)
		{
			int n = Rand.nextInt(100);
			int m;
		
			System.out.println("���� �����Ͽ����ϴ�. ���߾����");
			System.out.println("0-99");
		
			for(int i = 1; ;i++)
			{
				System.out.print(i + ">>");
				m = input.nextInt();
			
				if(n>m)
					System.out.println("�� ����");
				else if(n<m)
					System.out.println("�� ����");
				else
				{
					System.out.println("�¾ҽ��ϴ�");
					break;
				}
			}
			
			System.out.print("�ٽ� �Ͻðڽ��ϱ�(y)>>");
				
			if(input.next().equals("y"))
			{
				continue;
			}
				
			else
			{
				break;
			}
			
		}
	}
}

