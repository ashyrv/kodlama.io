public class Main {

	public static void main(String[] args) {
		
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		Instructor egitmen1 = new Instructor(001, "Engin" , "Demirog" , "engindemirog@kodlama.io",
				9, "C# , Java");
		
		Student ogrenci1 = new Student (1358, "Melih", "Gogebakan", "Turkiye", 22, 
				"melihgogebakan@mail.com", 0.49, "Java");
		
		studentManager.add(ogrenci1);
		studentManager.addFavorite(ogrenci1);
		
		instructorManager.add(egitmen1);
		instructorManager.addRecord(egitmen1);
		
		
	}

}
