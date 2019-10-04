import java.util.Arrays;

public class Student {
	public static void highSchool() {
		String[] studentList = {"Josh Moshe", "George Pop", "Tom Brokaw", "Isabelle Frank"}; //List all the teachers in the High School and store in an array
		Arrays.sort(studentList);
		
		for(int i=0; i< studentList.length; i++) { //All these listing ones work about the same. Refer to Teacher for more info
			System.out.println(studentList[i]);
		}
	}
	public static void middleSchool() { 
		String[] studentList = {"Kelly Smith", "Heather Wilson"};
		Arrays.sort(studentList);
		
		for(int i=0; i< studentList.length; i++) {
			System.out.println(studentList[i]);
		}
	}
	public static void elementarySchool() {
		String[] studentList = {"Mark Levine"};
		Arrays.sort(studentList);
		
		for(int i=0; i< studentList.length; i++) {
			System.out.println(studentList[i]);
		}
	}
	public static void josh() {
		String[] classesEnrolledIn = {"Precalc-5", "US History-4"};
		short gradeLevel = 11;
		Arrays.sort(classesEnrolledIn);
		System.out.println("Grade " +gradeLevel);
		
		for(int i=0; i< classesEnrolledIn.length; i++) {
			System.out.println(classesEnrolledIn[i]);
		}
	}
	/**
	 *  Written By Haadi Khan
	 */
}
