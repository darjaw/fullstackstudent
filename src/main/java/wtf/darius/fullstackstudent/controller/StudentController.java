package wtf.darius.fullstackstudent.controller;

import org.springframework.web.bind.annotation.*;
import wtf.darius.fullstackstudent.model.Student;
import wtf.darius.fullstackstudent.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        //use saveStudent method from studentServiceImplementation to send student to MariaDB
        studentService.saveStudent(student);
        return "New student added";
    }

    @GetMapping("/getAll")
    public List<Student> getAll() {
        //use getAllStudents method from studentServiceImplementation to get all students from MariaDB
        return studentService.getAllStudents();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        //use deleteStudent method from studentServiceImplementation to delete student from MariaDB
        studentService.deleteStudent(id);
        return "Student deleted";
    }
}

