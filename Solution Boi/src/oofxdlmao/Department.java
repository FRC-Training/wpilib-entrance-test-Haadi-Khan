package oofxdlmao;
import java.util.*;
public class Department
{
    public static ArrayList<Department> allDepartments = new ArrayList<Department>();
    String name;
    public Department(String n) {
        name=n;
        allDepartments.add(this);
    }
    public String toString()
    {
        return name;
    }
    public static ArrayList<Department> getAllDepartments() {
        return allDepartments;
    }
}