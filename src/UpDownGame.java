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
		
			System.out.println("수를 결정하였습니다. 맞추어보세요");
			System.out.println("0-99");
		
			for(int i = 1; ;i++)
			{
				System.out.print(i + ">>");
				m = input.nextInt();
			
				if(n>m)
					System.out.println("더 높게");
				else if(n<m)
					System.out.println("더 낮게");
				else
				{
					System.out.println("맞았습니다");
					break;
				}
			}
			
			System.out.print("다시 하시겠습니까(y)>>");
				
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

