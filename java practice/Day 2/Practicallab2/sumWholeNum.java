//Sum of whole numbers
import java.util.Scanner;
public class sumWholeNum {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no :");
        int n=sc.nextInt();
        for(int i=0 ;i<n;i++){
            count=count+i;
            System.out.print(" "+count);

        }
    }
}
