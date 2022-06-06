package wtf.darius.fullstackstudent.service;

import wtf.darius.fullstackstudent.model.Student;

import java.util.List;

public interface StudentService {
     void saveStudent(Student student);
     List<Student> getAllStudents();

    void deleteStudent(int id);
}

