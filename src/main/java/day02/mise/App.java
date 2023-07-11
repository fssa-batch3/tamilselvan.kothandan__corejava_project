package day02.mise;

public class App {
    public static void main(String[] args) {
        Academy ac = new Academy();
        ac.setName("freshworks STS software academy");
        ac.setCode("fssa");
        ac.setId(12);

        Student s = new Student();
        s.setName("tamil");
        s.setEmail("tamil@fssa.freshworks.com");
        s.setId(2);
        System.out.println(Student.count);

        Student s1 = new Student();
        s1.setName("mathi");
        s1.setEmail("mathi@fssa.freshworks.com");
        s1.setId(3);
        System.out.println(Student.count);
    }
}
