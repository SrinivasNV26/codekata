import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int val=in.nextInt();
		int rem,digit=0;
		int a=val;
		while(a!=0)
		{
			rem=a%10;
			digit=(digit*10)+rem;
			a=a/10;
		}
		if(val==digit)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
