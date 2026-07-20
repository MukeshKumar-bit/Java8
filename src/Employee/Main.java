package Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(111, "mukesh", 32, "Male", "HR", 2011, 2500.0));
		list.add(new Employee(112, "rakesh", 31, "Male", "software", 2012, 2600.0));
		list.add(new Employee(113, "saket", 34, "Male", "HR", 2011, 2800));
		list.add(new Employee(114,"radha",60,"female","HR",2026,4000));
		
		
		//How many mail and female employees are there in the organization
		Map<String,Long> countMaleAndFemale=list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(countMaleAndFemale);
		System.out.println("-----------------------------------------");
		//print the name of all departments in the organization	
		list.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		System.out.println("-----------------------------------------");
		//What is the average age of male and female employees
		Map<String, Double> averageAge=list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(averageAge);
		System.out.println("-----------------------------------------");
		//get the details of higest paid employee in the organization
		Optional<Employee> highestPaidSalary=list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(highestPaidSalary);
		System.out.println("------------------------------------------");
		//get the names of all employees who have joined after 2025
		list.stream().filter(e->e.getYearsOfJoining()>2025).map(Employee::getName).forEach(System.out::println);
		System.out.println("------------------------------------------");
		//count the number of employees in each department
		Map<String, Long> numberOfEmployee=list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(numberOfEmployee);
		System.out.println("-------------------------------------------");
		//what is the average salary of the each department
		Map<String, Double> averageSalary=list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(averageSalary);
		
		//
		
		

	}

}
