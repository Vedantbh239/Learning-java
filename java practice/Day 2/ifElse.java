import java.util.Scanner;
public class ifElse {
public static void main(String[] args) {
    //write a program to check if the numbeer is even or odd.
    Scanner sc=new Scanner(System.in);
 System.out.print("Enter a no :");
 int no =sc.nextInt();
 if(no%2==0){
    System.out.println("The no is even");
} else{
    System.out.println("odd");
}
}    
}
