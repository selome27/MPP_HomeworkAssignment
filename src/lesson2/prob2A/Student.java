package lesson2.prob2A;

public class Student {
    private String name;
    private GradeReport gr;

    public Student(String name){
        this.name = name;

     //   gr = new GradeReport();
    }

    public void setGr(GradeReport gr){
        this.gr = gr;
    }

    public String getName() {
        return name;
    }

    public GradeReport getGr() {
        return gr;
    }

   /* @Override
    public String toString() {
        return  "Student :" + " " + name  + " "
                + "Grade report is" + " " + gr.getGrade();
    }*/
}
