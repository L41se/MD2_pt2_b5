package Static_method;

public class StaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "kien");
        Student s2 = new Student(222, "nguyen");
        Student s3 = new Student(333,"nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
