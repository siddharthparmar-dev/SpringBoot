package main;

import services.Devops;
import services.ICourse;

public class Hello {


     ICourse course;

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public boolean buyTheCourse(double amount){
//        Devops dev = new Devops();
//        dev.registerTheCourse(256);

        // this is tightly coupled

        // we want to use method of Devops it without using name of that class
        course.registerTheCourse(amount);
        return true;
    }
}

