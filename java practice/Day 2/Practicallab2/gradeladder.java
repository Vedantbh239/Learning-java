import java.util.Scanner;

public class gradeladder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks out of 100: ");
        int i=sc.nextInt();
        if (i>=90 && i<=100) {
            System.out.println("Your grade is A++");
        }
         if (i>=80 && i<90) {
            System.out.println("Your grade is A");
        }if (i>=70 && i<80) {
            System.out.println("Your grade is B");
        }if (i>=50 && i<=70) {
            System.out.println("Your grade is C");
        }if (i>=40 && i<50) {
            System.out.println("Your grade is D");
        }if(i<40){
            System.out.println("Fail");
        }
    }
}
