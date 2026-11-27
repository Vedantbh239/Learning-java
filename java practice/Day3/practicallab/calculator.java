
public class calculator {
public static void main(String[] args) {
    //Calculate using add(),subtarct(),multiply(),divison() and handle division by 0

    calc c=new calc(5, 5);
      c.display();
}    
}
class calc{
double a,b;

    calc(double a, double b) {
        this.a = a;
        this.b = b;
    }
double Add(){
    return a+b;
}
double Sub(){
    return a-b;
}double multiply(){
    return a*b;
}double divide(){
    if(b==0){
        System.out.println("b cannot be 0");
        
    }else{
        return a/b;
    }
    return 0;
}
void display(){
    System.out.println("Addition:"+Add());
    System.out.println("Subtraction:"+Sub());
    System.out.println("Multiplication:"+multiply());
    System.out.println("Division:"+divide());

}
}