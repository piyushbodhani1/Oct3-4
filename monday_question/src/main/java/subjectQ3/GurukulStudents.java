package subjectQ3;

// extends ->Inheritance
/**
 * @author PiyushBodhani
 *
 */
public class GurukulStudents extends GurukulTeachers {
    public String nameOfStudent() {
    	return "Krishu";
    }
    public String QualityOfStudent() {
    	return"Kathak";
    }

	//Method Overloading -> Compile time polymorphism
	public int Peoplesum(int a , int b) {
		return  a+b;
	}
	public int Peoplesum(int a) {
		return a;
	}

	//Encapsulation
	String grade;
	int marks;
	public String getGrade() {
		return "A+";
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getMarks() {
		return 90;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	} 
}
