package library_management;

public class Student {
	private  int studentid;
	 private  String StudentName;
	 public Student(int studentid, String studentName) {
		
		this.studentid = studentid;
		StudentName = studentName;
	 }
	 public int getStudentid() {
		return studentid;
	 }
	 public void setStudentid(int studentid) {
		this.studentid = studentid;
	 }
	 public String getStudentName() {
		return StudentName;
	 }
	 public void setStudentName(String studentName) {
		StudentName = studentName;
	 }

	 
	
}
