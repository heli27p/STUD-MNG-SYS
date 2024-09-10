package com.studs.STUD_MNG_SYS.Repo;

import com.studs.STUD_MNG_SYS.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student, String> {
}
