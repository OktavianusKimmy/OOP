package academic;

import actor.Student;
import actor.Lecturer;
import java.util.ArrayList;
import java.util.HashMap;

public class Class {
    public String classCode;
    public int semester;
    public String year;

    public Class(String classCode, int semester, String year) {
        this.classCode = classCode;
        this.semester = semester;
        this.year = year;
    }

    public ArrayList<Course> courses = new ArrayList<Course>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        for(Course course : courses) {
            student.addCourse(course);
        }
        students.add(student);
    }

    public ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>();
    public void addLecturer(Lecturer lecturer, Course course) {
        lecturers.add(lecturer);
        lecturer.courses.add(course);
    }

    public HashMap<Student, Boolean> attendance = new HashMap<Student, Boolean>();

    public void attend(Student student){
        attendance.put(student, true);
    }

    public HashMap<Lecturer, Boolean> attendanceLec = new HashMap<Lecturer, Boolean>();
    public void takeAttendance(Lecturer lecturer){
        attendanceLec.put(lecturer, true);
    }

    public void showTodayAttendance(){
        System.out.println("Student Attendance:");
        for (Student student : students) {
            for(Student s : attendance.keySet()) {
                if (s.equals(student)) {
                    System.out.println(student.name + ": " + (attendance.get(student) ? "Present" : "Absent"));
                }
            }
        }
        System.out.println("Lecturer Attendance:");
        for (Lecturer lecturer : lecturers) {
            for(Lecturer l : attendanceLec.keySet()) {
                if (l.equals(lecturer)) {
                    System.out.println(lecturer.name + ": " + (attendanceLec.get(lecturer) ? "Present" : "Absent"));
                }
                else{
                    System.out.println(lecturer.name + ": Absent");
                }
            }
        }
    }
}
