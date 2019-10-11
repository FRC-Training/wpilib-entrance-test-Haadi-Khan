package oofxdlmao;
import java.util.*;
public class Teacher
{
    public static ArrayList<Teacher> allTeachers = new ArrayList<Teacher>();
    String name;
    public Teacher(String n) {
        name=n;
        allTeachers.add(this);
    }
    public String toString()
    {
        return name;
    }
    public static ArrayList<Teacher> getAllTeachers() {
        return allTeachers;
    }
}