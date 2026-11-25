import java.util.Scanner;

public class compareAge {
  public static void main() {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter 1st Age : ");
    int a=sc.nextInt();
    System.out.print("\nEnter 2nd age: ");
    int b=sc.nextInt();
    System.out.print("\nage1==age2: " + (a==b));
    System.out.print("\nage1!=age2: " + (a!=b));
    System.out.print("\nage1>=age2: " + (a>=b));
    System.out.print("\nage1<=age2: " + (a<=b));
}
}