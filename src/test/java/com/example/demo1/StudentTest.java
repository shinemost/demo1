package com.example.demo1;

import com.example.demo1.Repository.StudentRepository;
import com.example.demo1.domain.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * author:fhj
 * date:2017/6/29 0029 15:30
 */
@RunWith(SpringRunner.class)//SpringRunner是SpringJUnit4ClassRunner的新名字，这个名字只是让名字看起来简单些。
@SpringBootTest
public class StudentTest {

    @Autowired
    private StudentRepository repository;

    @Before
    public void setUp() {
        repository.deleteAll();
    }

    @Test
    public void test1() {
        repository.save(new Student("1", 12, "谭力"));
        repository.save(new Student("2", 13, "付海静"));
        Assert.assertEquals(2, repository.findAll().size());
    }

    @Test
    public void test2() {
        Student s = repository.findByName("谭力");
        System.out.println(s.toString());
        repository.delete(s);
        Assert.assertEquals(1, repository.count());
    }

    @Test
    public void test3() {
        Student s = repository.findOne("2");
        repository.delete(s);
        Assert.assertEquals(0, repository.count());

    }
}
