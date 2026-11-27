//Constructor overloading

public class constOverload {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mouse", 25);

        p1.display();
        p2.display();
        p3.display();s
    }
}
class Product{
    String name;
    int price;

    public Product() {
    }
    
    Product(String name){
        this.name=name;
    }
    Product(String name,int price){
        this.name=name;
        this.price=price;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
}