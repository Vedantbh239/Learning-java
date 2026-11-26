import java.util.Scanner;
public class multi {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no: ");
        int no=sc.nextInt();
        int i=1;
        while(i<=10){
        System.out.print(" "+no*i);
        i++;
        }
    }
}
