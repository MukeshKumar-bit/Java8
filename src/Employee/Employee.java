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

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getDepartment() {
	return Department;
}

public void setDepartment(String department) {
	Department = department;
}

public int getYearsOfJoining() {
	return yearsOfJoining;
}

public void setYearsOfJoining(int yearsOfJoining) {
	this.yearsOfJoining = yearsOfJoining;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", Department="
			+ Department + ", yearsOfJoining=" + yearsOfJoining + ", salary=" + salary + "]";
}


}
