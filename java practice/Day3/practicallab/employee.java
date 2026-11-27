//create employe class with employee name and salary .Add a displaydetails() method and create at least two employee objects;

public class employee {
    public static void main(String[] args) {
        emp emp1= new emp("Vedant", 10000, "Lala");
          emp emp2= new emp("Nishant", 15000, "TCS");
          emp1.displayid();
          emp2.displayid();
            }
}



class emp{
    String name;
    int salary;
    String company;
emp(String name,int salary,String company){
    this.name=name;
    this.salary=salary;
    this.company=company;
}
void displayid() {
    System.out.println("\nEmployee  name:"+name);
    System.out.println("Salary:"+salary);
    System.out.println("Company: "+company);
}
}