package testQ3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import subjectQ3.GurukulStudents;

/**
 * @author PiyushBodhani
 *
 */
public class GurukulTest {
	@Test
	public void GuruTest() {
		GurukulStudents g = new GurukulStudents();
		String str = g.nameOfStudent();
		System.out.println("Name Of the student:-" + str);
		assertEquals("Krishu", str);
		String str1 = g.QualityOfStudent();
		System.out.println("Perfomance:-" + str1);
		assertEquals("Kathak", str1);
		int no = g.noOfClasses();
		System.out.println("No of the class in gurukul:-" + no);
		assertEquals(6, no);
		String s = g.name1();
		System.out.println("Name of Guru:-" + s);
		assertEquals("Suresh", s);
		int guest = g.noOfGurus();
		System.out.println("No of the gurus:-" + guest);
		assertEquals(3, guest);
		int Stu = g.TotalStudents();
		System.out.println("Total Students:-" + Stu);
		assertEquals(10, Stu);
		int sum = g.Peoplesum(guest, Stu);
		System.out.println("Total Individulas:-" + sum);
		assertEquals(guest + Stu, sum);
		int sum1 = g.Peoplesum(Stu);
		assertEquals(sum1, Stu);
		System.out.println("Total Students:-" + sum1);
		String grade1 = g.getGrade();
		assertEquals("A+", grade1);
		System.out.println("Grade Of Student" + grade1);
		int marks = g.getMarks();
		assertEquals(90, marks);
		System.out.println("Marks Of Student" + marks);

	}
}
