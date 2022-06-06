package wtf.darius.fullstackstudent.service;

import org.springframework.stereotype.Service;
import wtf.darius.fullstackstudent.model.Student;
import wtf.darius.fullstackstudent.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImplementation(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(int id) {
        Student deletedStudent = studentRepository.getReferenceById(id);
        studentRepository.delete(deletedStudent);
    }

}

