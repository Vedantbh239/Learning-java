import java.util.Scanner;
public class subjectPercentage {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks for each subject out of 20");
        System.out.print("\n Sub1:");
        double Sub1=sc.nextInt();
        System.out.print("\n Sub2:");
        double Sub2=sc.nextInt();
        System.out.print("\n Sub3:");
        double Sub3=sc.nextInt();
        System.out.print("\n Sub4:");
        double Sub4=sc.nextInt();
        System.out.print("\n Sub5:");
        double Sub5=sc.nextInt();
        System.out.print("\n Sub6:");
        double Sub6=sc.nextInt();
        double subtotal=Sub1+Sub2+Sub3+Sub4+Sub5+Sub6;
        double total=20*6;
        double percecentage=(subtotal/total)*100;
        System.out.println("Your Percentage is :"+percecentage);
    }
}
