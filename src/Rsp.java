import java.util.Scanner;

public class Rsp
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		
		System.out.print("ö�� >> ");
		String a = in.next();
		
		System.out.print("���� >> ");
		String b = in.next();
		
		if(a.equals("����"))
			if(b.equals("����"))
				System.out.println("�����ϴ�");
			else if(b.equals("����"))
				System.out.println("���� �̰���ϴ�");
			else
				System.out.println("ö���� �̰���ϴ�");
		
		else if(a.equals("����"))
			if(b.equals("����"))
				System.out.println("ö���� �̰���ϴ�");
			else if(b.equals("����"))
				System.out.println("�����ϴ�");
			else
				System.out.println("���� �̰���ϴ�");
				
		else 
			if(b.equals("����"))
				System.out.println("���� �̰���ϴ�");
			else if(b.equals("����"))
				System.out.println("ö���� �̰���ϴ�");
			else
				System.out.println("�����ϴ�");
	}
}
