package com.CourseApplication;

import com.CourseApplication.Service.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PurchaseCourse {

    @Autowired
    @Qualifier(value = "devops")
    private Course course;

    /*
constructor DI
    public PurchaseCourse(String course) {
        this.course = course;
    }
Setter DI
    public void SetCourseName(String course) {
        this.course = course;
    }
Field Di
    public void addCourse(String course) {
        this.course = course;
    }
*/

    public String BuyCourse(int amount) {
        return course.NewCourse(amount);
    }
}
