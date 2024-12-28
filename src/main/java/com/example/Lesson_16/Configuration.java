package com.example.Lesson_16;

import dao.Impl.StudentImpl;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class Configuration {

    @Bean(name = "studentDao")
   public StudentImpl studentDao(){
       return new StudentImpl();
   }

}
