package com.edgetech.first.contollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private StudentService eric = new StudentService("Eric", 47);
    @RequestMapping("/welcome")
    public String welcome() {
        return "Student Name: " + eric.getName() + "<br>" + "Student age: " + eric.getAge();
    }
}

class WelcomeService {
    public String returnWelcomeMessage() {
        return "Hello World!";
    }
}

class StudentService {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StudentService(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentService{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}