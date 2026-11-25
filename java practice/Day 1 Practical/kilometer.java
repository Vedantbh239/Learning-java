import java.util.Scanner;
public class kilometer {
 public static void main() {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the no of Kilometers: ");
    int kilometer=sc.nextInt();
    int meter=kilometer*1000;
    int centimeter=kilometer*100000;
    System.out.println(kilometer+"Kilometers in meters is "+meter+" And in Centimeter is: "+centimeter);
}    
}
