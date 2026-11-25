import java.util.Scanner;
public class arithmaticOperators {
  public static void main() {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter 1st value : ");
    int a=sc.nextInt();
    System.out.print("\nEnter 2nd value : ");
    int b=sc.nextInt();
        int sum=a+b;
        int diff=a-b;
        int mul=a*b;
        double  div=a/b;
        int rem=a%b;
        System.out.println("\nSum is :"+sum );
        System.out.println("Diff is :"+diff);
        System.out.println("Multiplication :"+mul);
        System.out.println("Division is :"+div);
        System.out.println("Remainder is :"+rem);
        
}
}