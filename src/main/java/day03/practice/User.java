package day03.practice;

public class User {

	
	
	    private String name;
	    private String password;
	    private String emailId;

	    // First constructor
	    public User() {
	        // Default constructor with no parameters
	    }

	    // Second constructor (overloaded)
	    public User(String name, String password, String emailId) {
	        this.name = name;
	        this.password = password;
	        this.emailId = emailId;
	    }

	    public String getName() {
		    return name;
		}
		
		public String getPassword() {
		    return password;
		}
		
		public String getEmailId() {
		    return emailId;
		}
		
		public void setName(String newName) {
		    name = newName;
		}
		
		public void setPassword(String newPassword) {
			password = newPassword;
		}
		
		public void setEmailId(String newEmailId) {
			emailId = newEmailId;
		}

	   
	}

	

