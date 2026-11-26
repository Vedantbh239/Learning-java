public class bre {
public static void main(String[] args) {
    //break and continue 
    System.out.println("Continue:");
    for (int i = 0; i <=10; i++) {
    if(i==3){
            continue;
        }
        System.out.println(" "+i);
    }
    System.out.print("\nbreak:");
    for(int j=0;j<=10;j++){
        if(j==3){
          break;
        }
        System.out.println(" "+j);
    }
}    
}
