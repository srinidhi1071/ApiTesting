package model;

public class Donar {
	private String address;
	private int age;
	private String bloodGroup;
	private String emailId;
	private String fullName;
	private String gender;
	private String mobileNo;
	private int donarId;
	
	public Donar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Donar(String address, int age, String bloodGroup, String emailId, String fullName, String gender,
			String mobileNo, int donarId) {
		super();
		this.address = address;
		this.age = age;
		this.bloodGroup = bloodGroup;
		this.emailId = emailId;
		this.fullName = fullName;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.donarId = donarId;
	}

	public int getDonarId() {
		return donarId;
	}

	public void setDonarId(int donarId) {
		this.donarId = donarId;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}
