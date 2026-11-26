public class looop {
public static void main(String[] args) {
    //write a program to print no from 1 to 10
    System.err.print("For loop:");
    for(int i=1;i<=10;i++){
      System.out.print( i + " ");}
    //while loop for same
    int i=1;
    System.err.print("\nWhile loop:");
    while (i<=10) { 
       
        System.out.print(" "+i);
        i++;
    }
    //Do-while loop for same
    int j=1;
    System.out.print("\nDo While:");
    do {
        System.out.print(j+" ");
        j++;
    } while (j<=10);
}    
}
//write a program to print even and odd no's from 1 to 1000