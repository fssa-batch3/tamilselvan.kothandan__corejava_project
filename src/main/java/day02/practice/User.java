package day02.practice;

public class User {
    private int id;
    private String name;
    private String password;
    private String emailId;
    
    public int getId() {
        return id;
    }
    
    public void setId(int newId) {
        id = newId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String newPassword) {
       password = newPassword;
    }
    
    public String getEmailId() {
        return emailId;
    }
    
    public void setEmailId(String newEmailId) {
       emailId = newEmailId;
    }
}
