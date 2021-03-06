package org.example.student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getStudents();

    Optional<Student> getStudent(Integer id);

    Student addStudent(Student student);

    Student updateStudent(Student student);

    void removeStudent(Integer id);
}
