package oofxdlmao;
import java.util.*;
public class Student {	
    String firstName;
    String lastName;                                                      //some litty variables
    ArrayList<String> years = new ArrayList<String>();
    ArrayList<String> dates = new ArrayList<String>();
    ArrayList<Sections> sections = new ArrayList<Sections>();
    ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    ArrayList<String> schools = new ArrayList<String>();
    ArrayList<Double> grades = new ArrayList<Double>();
    
    public static ArrayList<Student> allStudents = new ArrayList<Student>();
    
    public Student(String fn, String ln, ArrayList<String> y, ArrayList<String> d, ArrayList<Sections> c, ArrayList<Teacher> t, ArrayList<String> s, ArrayList<Double> g){
        firstName = fn;
        lastName = ln;													//lit class boi
        years = y;
        dates = d;
        sections = c;
        teachers = t;
        schools = s;
        grades = g;
        allStudents.add(this);
    }
    public String toString() {
        return (firstName+lastName+years+dates+sections+teachers+schools+grades);
    }
    public String getSectionData(int i) {
        return(years.get(i)+dates.get(i)+sections.get(i)+teachers.get(i)+schools.get(i)+grades.get(i));
    }
    public static ArrayList<Student> getAllStudents() {
        return allStudents;
    }
}