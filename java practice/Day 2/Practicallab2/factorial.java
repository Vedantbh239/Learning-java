//Factorial of a non negative integer
import java.util.Scanner;
public class factorial {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a no: ");
    int num=sc.nextInt();
    int count=1;
    if (num<0) {
        System.out.println("Invalid input the no is below 0");
    } else {
        for(int i=num;i>0;i--){
           count=count*i;        
        }   
    }System.out.println(count);
    
}    
}
