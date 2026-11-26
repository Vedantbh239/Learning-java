//Search an element in an array using a loop.print whether it was found also print its index
import java.util.Scanner;
public class eleinArr {
    public static void main(String[] args) { 
    Scanner sc =new Scanner(System.in);
    int arr[]={1,5,3,6,7,2,8};
    System.out.print("Enter a no you want to find in the array:");
    int f=sc.nextInt();
    int count=0;
    for(int i=0;i<arr.length;i++){
    if(f==arr[i]){
        count=1;
        System.out.println("Index:"+i);
    }
}
    if(count==1){
        System.out.print("Element was found in Array");
    }else{
        System.out.println("Element you enterd was not found in the array");
    }
}
}
