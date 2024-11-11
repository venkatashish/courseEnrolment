import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    ArrayList<Integer> studentCourses = new ArrayList<>();

    Scanner ect = new Scanner(System.in);

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void enrolcourse(ArrayList<Course> courseList) {
        System.out.println("Select course code from below list to enrol to that course: -");
        for (Course element : courseList) {
            //System.out.println(element.getCode() + " || " + element.getName() + " || " + element.getInstructor());
            System.out.println(element);
        }
        int code = ect.nextInt();
        ect.nextLine();
        studentCourses.add(code);
    }

    public void displayAllCourses(ArrayList<Course> courseList) {
        for (Integer element : studentCourses) {
            for (Course element1 : courseList) {
                if(element == element1.getCode()) {
                    System.out.println("Course code:- " + element1.getCode() + " || Course name:- " + element1.getName());
                }
            }
        }
    }
}
