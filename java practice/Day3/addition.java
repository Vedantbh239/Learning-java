//paramaterized wala incomplete hai 
public class addition {
    public static void main(String[] args) {
        int sum=0;
        arithmatic obj=new arithmatic();
        sum=obj.addition(10 , 20);
        System.out.println("Addition of two numbers is : "+sum);
    }}
    class arithmatic{
        int multiply=1;
        arithmatic(){
            System.out.println("Inside default constructor");
        }
        arithmatic(int x,int y){
            System.out.println("Inside paramaterized constructor");
        }
        int addition(int a, int b){
            return a+b;
        }
    }

