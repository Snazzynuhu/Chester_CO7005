import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int grade;
    private String faculty;

    public Student(String name, int age, int grade, String faculty) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.faculty = faculty;
    }

    public int getGrade() {
        return grade;
    }

    public String getFaculty() {
        return faculty;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(otherStudent.grade, this.grade);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", grade=" + grade + ", faculty=" + faculty + "]";
    }
}

public class FacultyGradeRank {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Chris", 20, 85, "engineering"),
                new Student("Nabeel", 22, 92, "business"),
                new Student("Zihi", 21, 78, "computer"),
                new Student("Aston", 19, 95, "engineering"),
                new Student("Eve", 23, 88, "natural-science")
        };

        System.out.println("Original list of students:");
        for (Student student : students) {
            System.out.println(student);
        }

        Arrays.sort(students, Comparator.comparing(Student::getFaculty).thenComparing(Student::compareTo));

        System.out.println("\nSorted list using comparator:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
