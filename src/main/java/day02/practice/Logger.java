package day02.practice;

public class Logger {
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void info (String msg) {
		System.out.println("iIfo: " + msg);
	}
	
	public static void error (String msg) {
		System.out.println("Error: " + msg);
	}
	
	public static void debug (int num) {
		 System.out.println("Debug: " + num);
	}
	
	 public static void info(int num) {
		 System.out.println("INFO: " + num);
	    }

	    public static void error(int num) {
	        System.err.println("ERROR: " + num);
	    }

	    public static void main(String[] args) {
	        Logger.debug("This is a debug message");
	        Logger.info("This is an info message");
	        Logger.error("This is an error message");
	        Logger.debug(42);
	        Logger.info(123);
	        Logger.error(999);
	    }}
