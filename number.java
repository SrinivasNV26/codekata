import java.util.Scanner;

public class number {
	public static void main(String[] args) {
		int count=0;
		Scanner in =new Scanner(System.in);
		System.out.println("enter the number:");
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			 count=count+i;
		}
		System.out.println(count);
	}

}
