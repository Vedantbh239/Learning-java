//rectangle class for area and perimeter

public class rectangle {
    public static void main(String[] args) {
        rect r=new rect(5, 9);
        r.Calculatearea();
        r.Calculateperimeter();
        r.display();
    }
}
class rect{
int length;
int breadth;
    rect(int length,int breadth){
    this.length=length;
    this.breadth=breadth;
    }
    int Calculatearea() {
        return length*breadth;
    }
    int Calculateperimeter() {
        return 2*(length+breadth);
    }
void display(){
    System.out.print("Area:"+Calculatearea());
        System.out.print("\nPerimeter:"+Calculateperimeter());
}

}