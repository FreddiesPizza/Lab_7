package model;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    long studentID;
    int totalCredits;
    List<Course> enrolledCourses;

    public Student() {
    }

    public Student(String firstName, String lastName, long studentID) {
        super(firstName, lastName);
        this.studentID = studentID;
        this.totalCredits = 0;
        this.enrolledCourses = new ArrayList<>();
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    /**
     * adds a course to the student's list of courses
     * @param new_course
     */
    public void addCourse(Course new_course){
        enrolledCourses.add(new_course); //remember to add credits to student in controller (RegistrationSystem)
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", studentID=" + studentID +
                ", totalCredits=" + totalCredits +
                ", enrolledCourses=" +  enrolledCourses +
                '}';
    }

}
