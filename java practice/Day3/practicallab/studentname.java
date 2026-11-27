//Display name,rollno,branch using class

public class studentname {
    public static void main(String[] args) {
        Student student1=new Student("Vedant", 8, "Computer");
        student1.displayinfo();
        Student student2=new Student("Rahul", 20, "Mechanical");
        student2.displayinfo();
    }    
}
class Student{
    String name;
    int rollno;
    String branch;
Student(String name,int rollno,String branch){
    this.name=name;
    this.rollno=rollno;
    this.branch=branch;
}
void displayinfo() {
    System.out.println("\nStudent name:"+name);
    System.out.println("Roll no:"+rollno);
    System.out.println("Branch: "+branch);
}
    
}