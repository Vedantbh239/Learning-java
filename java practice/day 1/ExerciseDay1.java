


public class ExerciseDay1 {
    public static void main() {
       
        //Problem Statement 1:Display Personal Information
        System.out.println("My name is Vedant\nCollege:Saraswati college of engineering\nBranch:Computer Engineering \nCourse:Java");
       
        //Problem Statement 2:Basic Calculator
        int a=92;
        int b=10;
        int sum=a+b;
        int diff=a-b;
        int mul=a*b;
        double  div=a/b;
        int rem=a%b;
        System.out.println("\nSum is :"+sum );
        System.out.println("Diff is :"+diff);
        System.out.println("Multiplication :"+mul);
        System.out.println("Division is :"+div);
        System.out.println("Remainder is :"+rem);
        
        
        //Problem Statement 3:Rectangle Calculation
        int length=10;
        int breadth=5;
        int peri=2*(length+breadth);
        int area=length*breadth;
        System.out.println("\nPerimeter:"+peri);
        System.out.println("Area:"+area);
        
        
        //Problem Statement 4 Temperature Conversion
        int c=5;
        int f=(c*9/5)+32;
        System.out.println("\nFarhenite :"+f);
        
        
        //Problem Statement 5 Student marks
        int sub1=20;
        int sub2=19;
        int sub3=20;
        int sub4=15;
        int sub5=11;
        int total=sub1+sub2+sub3+sub4+sub5;
        System.out.println("\nThe total is :"+total);
        double aver=total/5;
        System.out.println("Average is : "+aver);

        //Problem Statement 6:Swap two numbers
        int d=5;
        int e=10;
        int temp;
         temp=d;
         d=e;
         e=temp;
         System.out.println("\nInitial no : d=5,e=10");
         System.out.println("After Swap:");
         System.out.println("d:"+d);
         System.out.println("e:"+e);
        
        //Problem Statement 7:int to double and double to int 
        int num1=10;
        double num2=num1;
        System.out.println("\nint 10 to double :"+num2);
        double num3=10.9;
        int num4=(int) num3;
        System.out.println("Double 10.9 to int :"+num4);

        //Problem Statement 8:Declare two numbers and print the result of ==,!=,>,<,>=8,8<='
        int n1=2;
        int n2 =4;
        System.out.println("\na==b:"+(a==b));    
        System.out.println("a!=b:"+(a!=b));
        System.out.println("a>b:"+(a>b));
        System.out.println("a<b:"+(a<b));
        System.out.println("a>=8:"+(a>=8));
        System.out.println("b<=8:"+(b<=8));  

        //Problem Statement 9:Logical Operators create boolean Variable for 
        //hasRegistration and hasPaid,Display if Student can attend exam using&&
        boolean hasRegistration =true, hasPaid=true;
        System.out.println("\nStudent can attend exam:"+(hasRegistration && hasPaid));

        //Problem Statement 10:Simple Bill-take a item add price and quantity,calculate subtotal , tax amount and final bill
        int price=100;
        int quantity=49;
        int subtotal=(price * quantity);
        int tax=(subtotal*18/100);
        int totamt=subtotal+tax;
        System.out.println("\nSubtotal:"+subtotal);
        System.out.println("Tax:"+tax);
        System.out.println("Final Bill: "+totamt);
    }
}
