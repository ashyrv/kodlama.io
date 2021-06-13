public class Instructor extends User {
	private int experience;
	private String teachingCourses;
	
	public Instructor(int id, String name, String lastName, String email, int experience, 
			String teachingCourses) {
		super(id, name, lastName, email, experience, teachingCourses);
		this.teachingCourses = teachingCourses;
		this.experience = experience;
	}
	
	public int getExperinece() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public String getTeachingCourses() {
		return teachingCourses;
	}
	public void setTeachingCourses(String teachingCourses) {
		this.teachingCourses = teachingCourses;
	}

}
