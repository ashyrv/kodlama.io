public class User {
	private int id;
	private String name;
	private String lastName;
	private String nationality;
	private int age;
	private String email;
	
	public User(int id, String name, String lastName, String nationality, int age, String email) {
		 this.id = id;
	     this.name = name;
	     this.lastName = lastName;
	     this.nationality = nationality;
	     this.age = age;
	     this.email = email;
	}
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
