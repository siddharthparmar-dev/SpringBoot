package main;
//************************** Tightly Coupled *************************************
//1. ==> creating object or compositon : Any change made on Alpha will directly affect beta class
//class Alpha {
//    public void disp(){
//        System.out.println("Alpha");
//    }
//}
//
//class Beta{
//    public void beta(){
//        Alpha a = new Alpha(); //composition
//        a.disp();
//    }
//}

import services.AIEngineering;
import services.Devops;
import services.SystemDesign;

// 2. ===> Inheritance : here also any changes on Alpha will effect Beta
class Alpha {
    public void disp(){
        System.out.println("Alpha");
    }
}

class Beta extends Alpha{
    public void beta(){
        disp();
    }
}

// invoking method of one class in other class without even using it name is called loose coupling
// one class able to use logic or method of some class, But other class name also should not be avialable here is called
// loose coupling

public class LaunchApp {
    public static void main(String[] args) {
        Devops dev = new Devops(); //dependent
        dev.registerTheCourse(900);
        AIEngineering Ai = new AIEngineering(); //dependent
        SystemDesign sd = new SystemDesign(); //dependent
        Hello h = new Hello(); //target
        h.setCourse(dev);
        boolean status =  h.buyTheCourse(500);
        if (status)
            System.out.println("Successful");
        else
            System.out.println("Failed to enroll");
    }
}
