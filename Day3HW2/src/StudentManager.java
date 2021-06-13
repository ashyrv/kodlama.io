public class StudentManager extends UserManager {
	public void add(Student student) {
		System.out.println(student.getName()+ 
				"isimli ogrenci profili olusturuldu.  Tercih edilen Ders : "  
				+ student.getChoosenCourseName());
	}
	
	public void addFavorite(Student student) {
		System.out.println(student.getId()+ "Kullanici numarasi ile kaydiniz olusturulmustur.");
	}

}
