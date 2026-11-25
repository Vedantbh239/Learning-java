import java.util.Scanner;
public class simpleInterest {
  public static void main() {
      Scanner sc= new Scanner(System.in);
      System.out.print("\nEnter Principle Amount: ");
      int Principle = sc.nextInt();
      System.out.print("\nEnter Rate of interest: ");
      int rate=sc.nextInt();
      System.out.print("\nEnter the no of years :");
      int time=sc.nextInt();
      int simpleInterest=(Principle * rate * time)/100;
    System.out.println("SimpleInterest on your amount is :"+ simpleInterest);
    System.out.println("Total amount to be paid after interest: "+(simpleInterest+Principle));
  }    
}
