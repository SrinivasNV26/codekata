import java.util.Scanner;

public class digit {
public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	System.out.println("enter the number :");
	int a=in.nextInt();
	int count=0;
	
	while(a>0)
	{
		a=a/10;
		count=count+1;
	}
	System.out.println(count);
}
}
