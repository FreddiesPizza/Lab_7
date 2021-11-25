package Tests;

import model.Course;
import model.Student;
import model.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.Course_Repo;
import repository.Student_Repo;
import repository.Teacher_Repo;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryRepositoryTest {

    @Test
    void testCreate() {
        Course_Repo course_repo = new Course_Repo();
        assertEquals( course_repo.getAll().size(), 0);

        Student_Repo student_repo = new Student_Repo();
        assertEquals( student_repo.getAll().size(), 0);

        Teacher_Repo teacher_repo = new Teacher_Repo();
        assertEquals( teacher_repo.getAll().size(), 0);
    }

    @Test
    void testGetAll() {

    }

    @Test
    void testDelete() {

    }
}