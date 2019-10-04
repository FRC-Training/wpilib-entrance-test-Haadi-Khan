
public class Grades {
	public static void fourthGrade() {
		int[] grades = {100,75};
		int total = 0;
		for(int i=0; i< grades.length; i++) {
			if(i == 0) {
				total = grades[i];
			} else {
				total = grades[i] + grades[i-1];
			}
		}
		double avg = total/grades.length +1;
		System.out.println(avg);
	}
	
	public static void PreCalc() {
		int[] grades = {70,65,90,83};
		
		int max = 0;
		for (int i = 1; i < grades.length; i++)
		{
		     if (grades[i] > max)
		     {
		      max = grades[i];
		     }
		}
		
		System.out.println(max);
	}
	
	public static void PreCalcAvg() {
		int[] grades = {70,65,90,83};
		int total = 0;
		for(int i=0; i< grades.length; i++) {
			if(i == 0) {
				total = grades[i];
			} else {
				total = grades[i] + grades[i-1];
			}
		}
		double avg = total/grades.length +1;
		System.out.println(avg);
	}

	public static void GoldmanPreCalcAvg() {
		int[] grades = {70,65,83};
		int total = 0;
		for(int i=0; i< grades.length; i++) {
			if(i == 0) {
				total = grades[i];
			} else {
				total = grades[i] + grades[i-1];
			}
		}
		double avg = total/grades.length +1;
		System.out.println(avg);
	}
}

/**
 * Written By Haadi Khan
 */