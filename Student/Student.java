package Student;

public class Student {
    private String name = "John";
    private String classes = "C02";
    public Student(){

    }
    public boolean setName(String name){
        this.name = name;
        return false;
    }

    public boolean setClasses(String classes) {
        this.classes = classes;
        return false;
    }
}
