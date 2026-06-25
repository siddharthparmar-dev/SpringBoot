package com.CourseApplication.Service;

import org.springframework.stereotype.Service;

@Service
public class AIEngineering implements  Course {
    @Override
    public String NewCourse(int amount) {
        return "Enrolled in AI Engineering course and fees paid is " + amount + "$";
    }
}
