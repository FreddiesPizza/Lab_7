package controller;

import exceptions.AlreadyExists;
import model.Student;
import model.Teacher;
import repository.Course_Repo;
import repository.Student_Repo;
import repository.Teacher_Repo;

public class Controller {

    private Course_Repo courseRepo;
    private Student_Repo studentRepo;
    private Teacher_Repo teacherRepo;

    public Controller(Course_Repo courseRepo, Student_Repo studentRepo, Teacher_Repo teacherRepo) {
        this.courseRepo = courseRepo;
        this.studentRepo = studentRepo;
        this.teacherRepo = teacherRepo;
    }

    public void createStudent(String firstName, String lastName, long studentID) throws AlreadyExists {
        for (Student s: studentRepo.getAll())
            if (s.getStudentID() == studentID)
                throw new AlreadyExists("A student with this ID already exists");
        Student newStudent = new Student(firstName, lastName, studentID);
        studentRepo.addStudent(newStudent);
    }

    public void updateStudent(String newFirstName, String newLastName, long studentID){
        Student updatedStudent = new Student(newFirstName, newLastName, studentID);
        studentRepo.update(updatedStudent);
    }

    public void createTeacher(String firstName, String lastName, int teacherID) throws AlreadyExists {
        for (Teacher t: teacherRepo.getAll())
            if (t.getTeacherID() == teacherID)
                throw new AlreadyExists("A teacher with this ID already exists");
        Teacher newTeacher = new Teacher(firstName, lastName, teacherID);
        teacherRepo.addTeacher(newTeacher);
    }

    public void updateTeacher(String newFirstName, String newLastName, int teacherID){
        Teacher updatedTeacher = new Teacher (newFirstName, newLastName, teacherID);
        teacherRepo.update(updatedTeacher);

    }

}
