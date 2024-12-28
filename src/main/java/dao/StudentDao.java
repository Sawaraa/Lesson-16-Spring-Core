package dao;

import com.example.Lesson_16.Student;

import java.util.List;

public interface StudentDao {

    void create(Student student);

    Student read(int id);

    void update(int id,Student student );

    void delete(int id);

    List<Student> readAll() ;

}
