class StudentResult {
    String name;
    int rollNumber;
    int[] marks;
    
    StudentResult(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    
    double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }
void displayResult() {
       System.out.println("Student Name: " + name); 
        System.out.println("Total: " + calculateTotal());
         System.out.println("Average: " + calculateAverage());
        }        
}
public class StudentResultDemo {
    public static void main(String[] args) {
     int [] marks = {85, 92, 78, 96, 88};
     StudentResult student = new StudentResult("Vedant",12,marks);
     student.displayResult();
    }
}