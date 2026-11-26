import java.util.Scanner;
public class arr {
    public static void main(String[] args) {
        //printing the no in the array by using its position
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Position:");
        int i=sc.nextInt();
        int arr[]={10,12,13,14,15};
        System.out.println(arr[i]);
        for(int j=0;j<= arr.length ;j++){
            System.out.println(" "+arr[j]);
        }
    }
}
