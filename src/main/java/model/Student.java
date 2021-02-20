package model;

public class Student {
	
	private String firstName;
	private String lastName;
	private String email;
	private String programme;
	private String[] courses;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String firstName, String lastName, String email, String programme, String[] courses) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.programme = programme;
		this.courses = courses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProgramme() {
		return programme;
	}
	public void setProgramme(String programme) {
		this.programme = programme;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	
}
