package org.example.myking.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.myking.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface UserMapper {
    public List<Student> queryAll();

    public int add(Student stu);

    public Student queryByName(String name);

}
