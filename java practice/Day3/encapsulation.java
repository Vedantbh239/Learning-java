//learning encapsulation
import java.util.Scanner;
public class encapsulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Do you have a voter id \nEnter 1 if you have one \nEnter 2 if you don't have one\nyour answer:");
        int ans=sc.nextInt();
            if(age>=18 && ans==1){
                System.out.println("You are eligible to Vote");
            }else{
                System.out.println("You are not eligible to vote");
            }
    
    }
}
