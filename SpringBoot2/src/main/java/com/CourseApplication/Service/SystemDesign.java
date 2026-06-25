package com.CourseApplication.Service;

import org.springframework.stereotype.Service;

@Service
public class SystemDesign implements  Course {
    @Override
    public String NewCourse(int amount) {
        return "Enrolled in System Design course and fees paid is " + amount + "$";
    }
}
