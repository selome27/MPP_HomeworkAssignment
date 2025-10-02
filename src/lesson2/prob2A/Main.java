package lesson2.prob2A;

public class Main {
    public static void main(String[] args){
        Student st = new Student("Birhan");
        GradeReport g = new GradeReport(st , "A");
        st.setGr(g);
        System.out.println("Student Name: " + st.getName() + " " + "Grade:" + st.getGr().getGrade());




        //System.out.println(st.getGr().getGrade());


    }
}
