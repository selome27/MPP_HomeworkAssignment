package lesson11_part2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Address add1 = new Address("500 E Broadway Ave", "Fairfield", "IA", 52556);
        Address add2 = new Address("103 W Adams Ave", "Fairfield", "IA", 52556);

        Section cs545_1 = new Section(900, "CS545");
        Section cs545_2 = new Section(901, "CS545");
        Section cs401 = new Section(902, "CS401");
        Section cs221 = new Section(903, "CS221");

        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(111, "Yasmeen", new ArrayList<>(Arrays.asList(3.9, 4.0, 3.7)), add1,
                        new ArrayList<>(Arrays.asList(cs545_1, cs401))),
                new Student(112, "Mira", new ArrayList<>(Arrays.asList(4.0, 4.0, 3.9)), add1,
                        new ArrayList<>(Arrays.asList(cs545_2, cs401, cs221))),
                new Student(113, "Zaina", new ArrayList<>(Arrays.asList(3.6, 3.3, 3.7)), add1,
                        new ArrayList<>(Arrays.asList(cs221, cs401))),
                new Student(114, "Khaled", new ArrayList<>(Arrays.asList(3.0, 2.8, 3.1)), add2)
        ));

        System.out.println("Students in CS401:");
        studentsInCourse(students, "CS401").forEach(System.out::println);
        addressesInCourse(students, "CS401").forEach(System.out::println);
        System.out.println( topStudent(students));
        System.out.println(allUniqueCourses(students));
        studentsInCity(students, "Fairfield").forEach(System.out::println);
        System.out.println(countStudentsInCourse(students, "CS545"));
        studentsInSection(students, 901).forEach(System.out::println);
        studentsWithManyCourses(students, 2).forEach(System.out::println);
        System.out.println(coursesInCity(students, "Fairfield"));
        addressesForCourse(students, "CS401").forEach(System.out::println);
        studentCourseMap(students).forEach((name, courses) -> System.out.println(name + " → " + courses)
        );
    }
        // Find all the students that are taking a given course

        public static List<Student> studentsInCourse(List<Student> students , String courseCode) {

            return students.stream()
                    .filter(s -> s.getSections() != null &&
                            s.getSections().stream()
                                    .anyMatch(sec -> sec.getCourseCode().equals(courseCode)))
                    .toList();
        }
        // Get the address of any student that is taking a given course (e.g., "CS401")
        public static List<Address> addressesInCourse(List<Student> students, String courseCode) {
            return students.stream()
                    .filter(s -> s.getSections() != null &&
                            s.getSections().stream()
                                    .anyMatch(sec -> sec.getCourseCode().equals(courseCode)))
                    .map(Student::getAddress)
                    .distinct()
                    .toList();
        }

    // Calculate the GPA for a given student
    public static double calculateGPA(Student student) {
        return student.getGrades().stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    // Find the student with the highest GPA
    public static Student topStudent(List<Student> students) {
        return students.stream()
                .max((s1, s2) -> Double.compare(calculateGPA(s1), calculateGPA(s2)))
                .orElse(null);
    }

    // Get a list of all unique courses taken by students
    public static List<String> allUniqueCourses(List<Student> students) {
        return students.stream()
                .filter(s -> s.getSections() != null)
                .flatMap(s -> s.getSections().stream())
                .map(Section::getCourseCode)
                .distinct()
                .toList();
    }


    // Find all students who live in a given city (e.g., "Fairfield") sorted in alphabetical order
    public static List<Student> studentsInCity(List<Student> students, String city) {

        return students.stream()
                .filter(s -> s.getAddress() != null && s.getAddress().getCity().equals(city))
                .sorted(Comparator.comparing(Student::getName))
                .toList();
    }

    // Count the number of students enrolled in a specific course (e.g., "CS401")

    public static long countStudentsInCourse(List<Student> students, String courseCode) {
        return students.stream()
                .filter(s -> s.getSections() != null &&
                        s.getSections().stream()
                                .anyMatch(sec -> sec.getCourseCode().equals(courseCode)))
                .count();
    }

    // Get a list of students in a specific section
    public static List<Student> studentsInSection(List<Student> students, int sectionId) {
        return students.stream()
                .filter(s -> s.getSections() != null &&
                        s.getSections().stream()
                                .anyMatch(sec -> sec.getId() == sectionId))
                .toList();
    }

    //  Get the names of students who have enrolled in more than a given number of courses (e.g., more than 2 courses)
    public static List<String> studentsWithManyCourses(List<Student> students, int minCourses) {
        return students.stream()
                .filter(s -> s.getSections() != null && s.getSections().size() > minCourses)
                .map(Student::getName)
                .toList();
    }

    // Get a list of unique course names taken by students who live in a given city (e.g., "Fairfield")
    public static List<String> coursesInCity(List<Student> students, String city) {
        return students.stream()
                .filter(s -> s.getAddress() != null && s.getAddress().getCity().equals(city))
                .filter(s -> s.getSections() != null )
                .flatMap(s -> s.getSections().stream())
                .map(Section::getCourseCode)
                .distinct()
                .toList();
    }

    // Get a list of distinct addresses of students who are taking a specific course (e.g., "CS401")

    public static List<Address> addressesForCourse(List<Student> students, String courseCode) {
        return students.stream()
                .filter(s -> s.getSections() != null &&
                        s.getSections().stream()
                                .anyMatch(sec -> sec.getCourseCode().equals(courseCode)))
                .map(Student::getAddress)
                .distinct()
                .toList();
    }

    // Get a mapping of students' names to the list of courses they are taking


    public static Map<String, List<String>> studentCourseMap(List<Student> students) {
        return students.stream()
                .filter(s -> s.getSections() != null)
                .collect(Collectors.toMap(
                        Student::getName,
                        s -> s.getSections().stream()
                                .map(Section::getCourseCode)
                                .toList()
                ));
    }

}

