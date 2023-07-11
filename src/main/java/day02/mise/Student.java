package day02.mise;

public class Student {
	String name;
	int id;
	String email;
	String academy;
	static int count = 0;
	
	public  Student() {
		Student.count++;
	}

	public String getName() {
	    return name;
	}
	
	public int getId() {
	    return id;
	}
	
	public String getEmail() {
	    return email;
	}
	
	public void setName(String newName) {
	    name = newName;
	}
	
	public void setId(int newId) {
	    id = newId;
	}
	
	public void setEmail(String newEmail) {
	    email = newEmail;
	}
	
	
}
