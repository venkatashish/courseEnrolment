import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        char addCourseResponse = 'Y';
        ArrayList<Course> courseList = new ArrayList<>();

        while(addCourseResponse == 'Y'){
            System.out.println("Enter the course name");
            String name = obj.nextLine();
            System.out.println("Enter the code of course");
            int code = obj.nextInt();
            obj.nextLine();
            System.out.println("Enter the name of instructor");
            String instructor = obj.nextLine();
            courseList.add(new Course(name, code, instructor));

            System.out.println("Do you want add more courses [Y/N]?");
            char continueResponse = obj.next().charAt(0);
            obj.nextLine();
            addCourseResponse = continueResponse;
        }

        System.out.println("Enter the name of the student");
        String studentName = obj.nextLine();
        System.out.println("Enter ID of the student");
        int id = obj.nextInt();
        Student s1 = new Student(studentName,id);
        s1.enrolcourse(courseList);
        s1.displayAllCourses(courseList);
    }
}
