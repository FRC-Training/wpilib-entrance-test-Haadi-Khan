
public class Heather {
	public static void classes() {
		String[] courses = {"Kindergarten","Science-2"};
		int[] grade = {89,99};
		int[] year = {0,7};
		int[] date = {2010,2016};
		
		for(int i=0;i < courses.length; i++) {
				System.out.println("Course: " + courses[i] + "\n" +
								   "Grade: " + grade[i] + "\n" + 
								   "Year: " + year[i] + "\n" + 
								   "Date: " + date[i] + "\n");
		}
		
	}
	public static void classesElementary() {
		String[] classes = {"Kindergarten"};
		
		for(int i=0;i < classes.length; i++) {
			System.out.println(classes[i]);
		}
	}
}
