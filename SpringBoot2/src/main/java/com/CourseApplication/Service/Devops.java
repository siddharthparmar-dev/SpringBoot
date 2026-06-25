package com.CourseApplication.Service;

import org.springframework.stereotype.Service;

@Service
public class Devops implements  Course {
    @Override
    public String NewCourse(int amount) {
        return "Enrolled in DevOps course and fees paid is " + amount + "$";
    }
}
