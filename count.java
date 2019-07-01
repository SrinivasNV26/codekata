import java.util.Scanner;

public class count {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number two number");
		int n=in.nextInt();
		int k=in.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<k;i++)
		{
			count=count+arr[i];
		}
		System.out.println(count);
	}

}
