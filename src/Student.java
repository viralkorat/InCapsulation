
public class Student {


	private String name;
	
	private String email;
	
	private String number;

	public Student(String name, String email, String number) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", number=" + number + "]";
	}
	
	}

