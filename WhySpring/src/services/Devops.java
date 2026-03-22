package services;

public class Devops implements ICourse{
    @Override
    public boolean registerTheCourse(double amount) {
        System.out.println("Registered in Devops course and fees paid is " + amount);
        return false;
    }
}
