
import java.util.Scanner;

public class exponent {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("enter the numbers");
		 int val=in.nextInt();
		 int pow=in.nextInt();
		 int result=1;
		 for(int i=1;i<=pow;i++)
		 {
			 result=val*result;
		 }
		 System.out.println(result);
	}

}
