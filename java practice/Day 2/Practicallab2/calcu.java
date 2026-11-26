import java.util.Scanner;
public class calcu {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a no1:");
     int a=sc.nextInt();
     System.out.print("\nEnter no2:");
     int b=sc.nextInt();
     System.out.println("Enter a no for the operation\n1.Add\n2.Subtract\n3.Multiply\n4.Divide");
     int c=sc.nextInt();
     switch (c) {
         case 1:
            System.out.println(a+b); 
             break;
        case 2:
            System.out.println(a-b);
            break;
        case 3:System.out.println(a*b);
        break;
        case 4:System.out.println(a/b);
        break;
        default:System.out.println("\nInvalid input");
     }
 }   
}
