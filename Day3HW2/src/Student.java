public class Student extends User {
	private double attendance;
	private String choosenCourseName;
	
	public Student(int id, String name, String lastName, String nationality, int age, String email,
			double attendance, String choosenCourseName) {
		 super(id, name, lastName, nationality, age, email);
	     this.attendance = attendance;
	     this.choosenCourseName = choosenCourseName;
	}
	
	public double getAttendance() {
		return attendance;
	}
	public void setAttendance(double attendance) {
		this.attendance = attendance;
	}
	
	public String getChoosenCourseName() {
		return choosenCourseName;
	}
	public void setChoosenCourseName(String choosenCourseName) {
		this.choosenCourseName = choosenCourseName;
	}
		 

}
