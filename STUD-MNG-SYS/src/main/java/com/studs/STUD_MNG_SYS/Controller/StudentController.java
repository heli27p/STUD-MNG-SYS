package com.studs.STUD_MNG_SYS.Controller;

import com.studs.STUD_MNG_SYS.Entity.Student;
import com.studs.STUD_MNG_SYS.Service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    @PostMapping(value="/save")
    private String saveStudent(@RequestBody Student students){
        studentServices.saveOrUpdate(students);
        return students.get_id();
    }

    @GetMapping(value="/getall")
    public Iterable<Student> getStudents(){
        return studentServices.listAll();
    }

    @RequestMapping("/search/{id}")
    private Student getStudents(@PathVariable(name="id") String _id){
        return studentServices.getStudentByID(_id);
    }

    @PutMapping(value="/edit/{id}")
    private Student update(@RequestBody Student student, @PathVariable(name="id") String _id){
        student.set_id(_id);
        studentServices.saveOrUpdate(student);
        return student;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteStudent(@PathVariable("id") String _id){
        studentServices.delete(_id);
    }
}
