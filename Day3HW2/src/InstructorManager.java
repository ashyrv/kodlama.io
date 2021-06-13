public class InstructorManager extends UserManager {
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getName()+ 
				"isminde yeni egitmen profili olusturuldu. Egitmenin alanda sahip oldugu tecrube : "
				+ instructor.getExperinece());
	}
	
	public void addRecord(Instructor instructor) {
		System.out.println("Sorumlu oldugunuz egitim kurslari :" + instructor.getTeachingCourses() + 
				"Basarilar dileriz!");
	}

}
