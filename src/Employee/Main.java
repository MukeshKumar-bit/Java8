package Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(111, "mukesh", 32, "Male", "HR", 2011, 2500.0));
		list.add(new Employee(112, "rakesh", 31, "Male", "software", 2012, 2600.0));
		list.add(new Employee(113, "saket", 34, "Male", "HR", 2011, 2800));

	}

}
