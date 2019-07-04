import java.util.Scanner;

public class multipleof5 {
 public static void main(String[] args) {
	
	 Scanner in=new Scanner(System.in);
	 int n= in.nextInt();
	 int result=1;
	 for(int i=1;i<=5;i++)
	 {
		result=i*n;
		 System.out.println(result);
	 }
}

}
