import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int val=in.nextInt();
		int flag=0;
		for(int i=2;i<11;i++)
		{
			if(val%i==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
