package Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(111, "mukesh", 32, "Male", "HR", 2011, 2500.0));
		list.add(new Employee(112, "rakesh", 31, "Male", "software", 2012, 2600.0));
		list.add(new Employee(113, "saket", 34, "Male", "HR", 2011, 2800));
		list.add(new Employee(114,"radha",60,"female","HR",2015,4000));
		
		
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
		

	}

}
