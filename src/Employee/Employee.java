package Employee;

public class Employee {
    int id;
    String name;
    int age;
    String gender;
    String Department;
    int yearsOfJoining;
    double salary;

   public Employee(int id,String name,int age,String gender,String department,int yearsOfJoining,double salary){
       this.id=id;
       this.name=name;
       this.age=age;
       this.gender=gender;
       this.Department=department;
       this.yearsOfJoining=yearsOfJoining;
       this.salary=salary;
   }
public int getId(){
       return id();
}

    private int id() {
    }

    public String getName(){
       return name;

}

}
