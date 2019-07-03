import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int val=in.nextInt();
		int rem,digit=0;
		int n;
		n=val;
		
		while(n>0)
		{
			rem=n%10;
			digit=digit+(rem*rem*rem);
			n=n/10;
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
