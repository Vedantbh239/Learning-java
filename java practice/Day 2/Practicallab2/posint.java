import java.util.Scanner;
public class posint {
    public static void main(String[] args) {
        //finding whether an integer is an positive,negative or zero integer
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a no : ");
            int i=sc.nextInt();
            if(i>0){
                    System.out.println("It's a positive integer ");
            }
            if (i<0) {
                System.out.println("It's a negative integer");
            }
            if (i==0){
                    System.out.println("The integer is 0");
                }
    }
}
