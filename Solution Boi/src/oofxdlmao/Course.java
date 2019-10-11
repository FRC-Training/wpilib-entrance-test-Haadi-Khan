package oofxdlmao;
import java.util.*;
public class Course{
    String name;
    Department dept;
    public static ArrayList<Course> allCourses = new ArrayList<Course>();
    public Course(String n, Department dept) {
        name=n;
        allCourses.add(this);
    }
    public String toString(){
        return name;
    }
    public static ArrayList<Course> getAllCourses() {
        return allCourses;
    }
    public static ArrayList<Course> getCoursesByDepartment(Department d) {
        ArrayList<Course> c = new ArrayList<Course>();
        for(int i=0;i<allCourses.size();i++) {
            if(allCourses.get(i).dept==d) {
                c.add(allCourses.get(i));
            }
        }
        return c;
    }
}