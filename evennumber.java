import java.util.Scanner;

 public class evennumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int start=in.nextInt();
		int s=in.nextInt();
		for(int i=start+1;i<=s;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}}
