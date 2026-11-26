//Problem Statement:Reverse a String using loop and character access
public class revstring {
    public static void main(String[] args) {
        String name="Vedant";
        for(int i=name.length()-1;i>=0;i--){
         System.out.print(name.charAt(i));
        }
    }
}
