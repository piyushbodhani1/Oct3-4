package testQ6;

import java.util.Map;
import java.util.HashMap;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import subjectQ6.Employee;

public class EmployeeTest {
	@Test
	public void checkEmployeeData() {
		
		Map<Integer, String> data = new HashMap<Integer, String>();
		
		data.put(1, "Rakesh");
		data.put(2, "Shivam");
		data.put(3, "Madhav");
		data.put(4, "Raghav");
		data.put(5, "Ashok");
		
		
		
		assertTrue(Employee.Employedetails().containsKey(1) && data.get(1) != null);
		assertTrue(Employee.Employedetails().containsKey(2) && data.get(2) != null);
		assertTrue(Employee.Employedetails().containsKey(3) && data.get(3) != null);
		assertTrue(Employee.Employedetails().containsKey(4) && data.get(4) != null);
		assertTrue(Employee.Employedetails().containsKey(5) && data.get(5) != null);
		

		assertEquals(Employee.Employedetails().containsValue("Rakesh"),data.containsValue("Rakesh"));
		assertEquals(Employee.Employedetails().containsValue("Shivam"),data.containsValue("Shivam"));
		assertEquals(Employee.Employedetails().containsValue("Madhav"),data.containsValue("Madhav"));
		assertEquals(Employee.Employedetails().containsValue("Raghav"),data.containsValue("Raghav"));
		assertEquals(Employee.Employedetails().containsValue("Ashok"),data.containsValue("Ashok"));
	}
}