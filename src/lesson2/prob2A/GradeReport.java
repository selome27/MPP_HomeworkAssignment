package lesson2.prob2A;

public class GradeReport {

        private  Student stud;
        private  String grade;

        public GradeReport(Student stud ,String grade ){
            this.stud = stud;
            this.grade = grade;
            //stud = new Student(grade);
           // this.grade = "A";
        }

    public String getGrade() {
        return grade;
    }

    public Student getStud() {
        return stud;
    }
}


