package lesson2.prob2A;

public class Student {
    private String name;
    private GradeReport gr;

    public Student(String name){
        this.name = name;
        gr = new GradeReport();
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public GradeReport getGr() {
        return gr;
    }
}
