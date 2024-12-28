package dao.Impl;

import com.example.Lesson_16.Student;
import dao.StudentDao;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentImpl implements StudentDao {

    List<Student> studentList  = new ArrayList<>();
    @Override
    public void create(Student student) {
        studentList.add(student);
    }

    @Override
    public Student read(int id) {
        for(Student stu : studentList){
            if(id == stu.getId()){
                System.out.println(stu);
                return stu;
            }
        }
        System.out.println("Student with" + id + "does not exist");
        return null;
    }

    @Override
    public void update(int id, Student updatedStudent) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.set(i, updatedStudent);
                System.out.println("Student with ID " + id + " updated to: " + updatedStudent);
            }
        }
    }

    @Override
    public void delete(int id) {
        boolean removed = studentList.removeIf(stu -> stu.getId() == id);
        if (!removed){
            System.out.println("Student with ID: " + id + " does not exist.");
        }
    }

    @Override
    public List<Student> readAll() {
        studentList.forEach(System.out::println);
        return studentList;
    }
}
