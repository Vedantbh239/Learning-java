


//Constructor inintialization in java
//book name ,author name ,price

public class author {
    public static void main(String[] args) {
        book b1=new book("White Nights"," Dostoevsky",500);
        book b2=new book("Romeo Juliet","William Shakespeare",400);
        b1.Display();
        b2.Display();
    }
}
class book{
    String Bookname;
    String Authorname;
    int price;
    book(String Bookname,String Authorname,int price){
      this.Bookname=Bookname;
      this.Authorname=Authorname;
      this.price=price;
    }
    void Display(){
        System.out.println("\nBookname:"+Bookname);
        System.out.println("Author:"+Authorname);
        System.out.println("price:"+price);
    }
}
