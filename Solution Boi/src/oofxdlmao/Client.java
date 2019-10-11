package oofxdlmao;
import java.util.*; //oh noes

public class Client {
    static Department meth = new Department("Math");
    

    
    static Department socialStudies = new Department("Social Studies");

    
    static Teacher goldman = new Teacher("Goldman");
    static Teacher cullen = new Teacher("Cullen");
    static Teacher doe = new Teacher("Doe");
    static Teacher smith = new Teacher("Smith");
    static Teacher liasi = new Teacher("Liasi");
    
    public static void main(String args[]) {

        System.out.println(Course.getAllCourses());
        System.out.println(Course.getCoursesByDepartment(meth));
    }
}