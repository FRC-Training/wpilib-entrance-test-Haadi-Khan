import java.util.Arrays;

public class Teacher {

	public static void main(String args[]) {
		highSchool();
	}
	public static void highSchool() {
		String[] teacherList = {"Goldman", "Cullen", "Liasi"}; //List all the teachers in the High School and store in an array
		Arrays.sort(teacherList);
		
		for(int i=0; i< teacherList.length; i++) { //Print all the elements of the array and loop until the index reaches array length
			System.out.println(teacherList[i]);
		}
	}
	public static void middleSchool() { //Next two practically are the same
		String[] teacherList = {"Doe"};
		Arrays.sort(teacherList);
		
		for(int i=0; i< teacherList.length; i++) {
			System.out.println(teacherList[i]);
		}
	}
	public static void elementarySchool() {
		String[] teacherList = {"Smith"};
		Arrays.sort(teacherList);
		
		for(int i=0; i< teacherList.length; i++) {
			System.out.println(teacherList[i]);
		}
	}
	
	public static void goldmanClasses() {
		String[] goldman = {"PreCalc-5","PreCalc-4","Algebra-7"};
		Arrays.sort(goldman);
		for(int i=0;i < goldman.length; i++) {
			System.out.println(goldman[i]);
		}
	}
	
	/**
	 * Written By Haadi Khan
	 */
}
