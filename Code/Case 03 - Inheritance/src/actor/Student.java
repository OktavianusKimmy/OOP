package actor;

import academic.Course;
import java.util.ArrayList;

public class Student extends People implements IAttendant{

    public Student(String nim, String name, String dob) {
        super(nim, name, dob);
    }

    public ArrayList<Course> courses = new ArrayList<Course>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void showCredits(int credits){
        int totalCredit = 0;
        for(Course course : courses){
            totalCredit += course.credit;
        }
        System.out.println(name + "'s total credits for semester " + credits + ": " + totalCredit);
    }
}
