package oofxdlmao;
import java.util.*;
public class Sections{
    String name;
    Course course;
    Teacher teacher;
    
    public static ArrayList<Sections> allSections = new ArrayList<Sections>();
    
    public Sections(String n, Course c) {
        name=n;
        course = c;
        allSections.add(this);
    }
    public String toString()
    {
        return name;
    }
    public static ArrayList<Sections> getSectionsByCourse(Course c) {
        ArrayList<Sections> s = new ArrayList<Sections>();
        for(int i=0;i<allSections.size();i++)
        {
            if(allSections.get(i).course==c) {
                s.add(allSections.get(i));
            }
        }
        return s;
    }
}