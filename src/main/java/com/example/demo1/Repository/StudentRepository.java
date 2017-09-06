package com.example.demo1.Repository;

import com.example.demo1.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

/**
 * author:fhj
 * date:2017/6/29 0029 14:51
 */
@Component
public interface StudentRepository extends MongoRepository<Student, String> {

    public Student findByName(String name);

}
