package day02.practice;

public class App {
	public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("Tamil");
        user.setPassword("Tamil@123");
        user.setEmailId("tamil@gmail.com");
        
        System.out.println("User ID: " + user.getId());
        System.out.println("User Name: " + user.getName());
        System.out.println("User Password: " + user.getPassword());
        System.out.println("User Email ID: " + user.getEmailId());
    }
}
