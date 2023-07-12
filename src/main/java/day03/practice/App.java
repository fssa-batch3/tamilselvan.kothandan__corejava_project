package day03.practice;

public class App {
	 public static void main(String[] args) {
	        User user1 = new User();

	        User user2 = new User("Tamil", "mypassword", "tamil@gmail.com");

	        user1.setName("selvan");
	        user1.setPassword("secretpassword");
	        user1.setEmailId("selvan@gmail.com");

	        System.out.println("User 1: " + user1.getName() + ", " + user1.getPassword() + ", " + user1.getEmailId());
	        System.out.println("User 2: " + user2.getName() + ", " + user2.getPassword() + ", " + user2.getEmailId());
	    }
}
