import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(otherStudent.grade, this.grade);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
    }
}

public class GradeRank {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Chris", 20, 85));
        students.add(new Student("Nabeel", 22, 92));
        students.add(new Student("Zihi", 21, 78));
        students.add(new Student("Aston", 19, 95));

        System.out.println("Original list of students:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students);
        System.out.println("\nSorted list using Collections.sort():");
        for (Student student : students) {
            System.out.println(student);
        }

        bubbleSort(students);
        System.out.println("\nSorted list using bubble sort:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Comparing time-taken
        long startTimeCollectionsSort = System.nanoTime();
        Collections.sort(students);
        long endTimeCollectionsSort = System.nanoTime();
        long durationCollectionsSort = endTimeCollectionsSort - startTimeCollectionsSort;

        long startTimeBubbleSort = System.nanoTime();
        bubbleSort(students);
        long endTimeBubbleSort = System.nanoTime();
        long durationBubbleSort = endTimeBubbleSort - startTimeBubbleSort;

        System.out.println("\nTime taken for Collections Sort " + durationCollectionsSort + " ns");
        System.out.println("Time taken for Bubble Sort: " + durationBubbleSort + " ns");

        System.out.println("\nCommentary:");

        // COMMENT
        // RUN1
        // Time taken for Collections Sort 4600 ns
        // Time taken for Bubble Sort: 6200 ns

        // RUN2
        // Time taken for Collections Sort 7000 ns
        // Time taken for Bubble Sort: 6500 ns

        // RUN3
        // Time taken for Collections Sort 8600 ns
        // Time taken for Bubble Sort: 7900 ns

        // RUN4
        // Time taken for Collections Sort 9700 ns
        // Time taken for Bubble Sort: 8800 ns

        // RUN5
        // Time taken for Collections Sort 13000 ns
        // Time taken for Bubble Sort: 7500 ns

        // MY TAKE:- Bubble sort is faster in this scenario, 
        // given the fact that from the output of the time taken, 
        // I ran five checks and in four cases Bubble sort was faster than Collection Sort.
     
    }

    private static void bubbleSort(List<Student> students) {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students.get(j).compareTo(students.get(j + 1)) < 0) {
                    Collections.swap(students, j, j + 1);
                }
            }
        }
    }
}
