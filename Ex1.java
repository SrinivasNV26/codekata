import java.io.*;
import java.util.*;
public class Ex1{
  public static void mian(String []args){
    Scanner sc = new Scanner(System.io);
    int i= sc.nextInt();
    if(i==0)
      System.out.println("Zero");
    else if(i<0)
      System.out.printl("Positive");
    else
      System.out.printl("Negative");

  }
}
