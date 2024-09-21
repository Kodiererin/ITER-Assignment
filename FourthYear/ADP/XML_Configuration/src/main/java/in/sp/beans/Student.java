package in.sp.beans;

public class Student { // POJO class
	private String studentName;
	private int studentId;
	private String studentAddres;
	
	public Student() {
		super();
	}
	
	public Student(String studentName , int studentId , String studentAddress) {
		super();
		this.studentAddres = studentAddress;
		this.studentName = studentName;
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentAddres() {
		return studentAddres;
	}

	public void setStudentAddres(String studentAddres) {
		this.studentAddres = studentAddres;
	}
	
	
}
