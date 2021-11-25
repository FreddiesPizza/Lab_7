package model;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

    int teacherID;
    List<Course> courses;

    public Teacher() {
    }


    public Teacher(String firstName, String lastName, int ID) {
        super(firstName, lastName);
        this.teacherID = ID;
        this.courses = new ArrayList<>();
    }

    public Teacher(String firstName, String lastName, List<Course> courses, int ID) {
        super(firstName, lastName);
        this.teacherID = ID;
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public int getTeacherID() { return teacherID;  }

    /**
     * adds a course to the teacher's list of courses
     * @param new_course
     */
    public void addCourse(Course new_course){
        courses.add(new_course);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", courses=" +  courses +
                '}';
    }
}
