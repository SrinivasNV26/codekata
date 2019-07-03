import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter the two numbers:");
		int low=in.nextInt();
		int high=in.nextInt();
		
		while (low < high) {
            boolean flag = false;
            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.print(low + " ");
            ++low;
        }
    }
}
