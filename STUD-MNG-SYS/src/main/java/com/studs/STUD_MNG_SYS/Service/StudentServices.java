package com.studs.STUD_MNG_SYS.Service;

import com.studs.STUD_MNG_SYS.Entity.Student;
import com.studs.STUD_MNG_SYS.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {

    @Autowired
    private StudentRepo repo;

    public void saveOrUpdate(Student students){
        repo.save(students);
    }

    public Iterable<Student> listAll(){
        return this.repo.findAll();
    }

    public Student getStudentByID(String studentID){
        return repo.findById(studentID).get();
    }

    public void delete(String studentID){
        repo.deleteById(studentID);
    }
}
