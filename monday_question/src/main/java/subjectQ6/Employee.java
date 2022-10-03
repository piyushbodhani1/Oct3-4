package subjectQ6;

import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;

public class Employee {

	public static Map<Integer, String> Employedetails() {

		Map<Integer, String> emp = new HashMap<Integer, String>(); // Integer for id, String for name.

		emp.put(1, "Rakesh");
		emp.put(2, "Shivam");
		emp.put(3, "Madhav");
		emp.put(4, "Raghav");
		emp.put(5, "Ashok");
 
		return emp;

	}

	public static void main(String[] args) {

		Employedetails().entrySet().stream().forEach(System.out::println);

	}

}
