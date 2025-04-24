package actor;

import academic.Course;
import java.util.ArrayList;

public class Lecturer extends People implements IAttendee{
    
    public Lecturer(String code, String name, String dob) {
        super(code, name, dob);
    }

    public ArrayList<Course> courses = new ArrayList<Course>();
    public void addCourse(Course course) {
        courses.add(course);
    }

    public void showCourse(int semester){
        System.out.println("Courses for semester " + semester + ": ");
        for (Course course : courses) {
            System.out.println(course.courseName + " (" + course.courseCode + ") - " + course.credit + " credits");
        }
    }
}
