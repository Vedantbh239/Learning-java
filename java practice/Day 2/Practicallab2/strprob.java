//Problem Statement:Given a string,print its length ,uppercase version,lowercase version and whether it contains word "java"
public class strprob {
   public static void main(String[] args) {
       String name="This is a Java Program";
       System.out.println("Length of String : "+name.length());
       System.out.println("Uppercase : "+name.toUpperCase());
        System.out.println("LowerCase : "+name.toLowerCase());
         System.out.println("Does String contains Java : "+name.toLowerCase().contains("java"));
    }    
}
