package repository;

import model.Teacher;

import java.util.List;

public class Teacher_Repo extends InMemoryRepository<Teacher> {

    List<Teacher> teachers;

    /**
     * updates a certain teacher in the repo by giving it the attributes of an as parameter given teacher
     * @param obj
     * @return the updated teacher
     */
    @Override
    public Teacher update(Teacher obj) {
        Teacher teacherToUpdate = this.repoList.stream()
                .filter(teacher -> teacher.getClass() == obj.getClass())
                .findFirst()
                .orElseThrow();

        teacherToUpdate.setCourses(obj.getCourses());
        teacherToUpdate.setFirstName(obj.getFirstName());
        teacherToUpdate.setLastName(obj.getLastName());

        return teacherToUpdate;

    }

    public void addTeacher(Teacher newTeacher){
        teachers.add(newTeacher);
    }

}