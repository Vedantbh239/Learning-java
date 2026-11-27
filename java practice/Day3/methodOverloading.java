public class methodOverloading {

    class Overloading {

        int addition(int a, int b) {
            return a + b;
        }

        int addition(int a, int b, int c) {
            return a + b + c;
        }

        double addition(int a, int b, int c, int d) {
            return a + b + c + d;
        }
        //Same method and parameter should not be there
        //int addition(int a, int b)
        //double addition(int a, int b)
        //this is  not overloading
        //This is overloading:
        //int addition(int a, int b)
        //double addition(int a, int b,int c)
    }

    public static void main(String[] args) {

        methodOverloading outer = new methodOverloading();
        Overloading obj = outer.new Overloading();

        System.out.println(obj.addition(10, 20));
        System.out.println(obj.addition(10, 20, 30));
        System.out.println(obj.addition(10, 20, 30, 40));
    }
}