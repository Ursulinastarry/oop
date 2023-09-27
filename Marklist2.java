package marklist;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Marklist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        Scanner in = new Scanner(System.in);
		        int numStudents = 4;

		        String[] names = new String[numStudents];
		        int[][] marks = new int[numStudents][3];
		        int[] totals = new int[numStudents];
		        double[] averages = new double[numStudents];
		        char[] results = new char[numStudents];
		        String[] grades = new String[numStudents];

		        for (int i = 0; i < numStudents; i++) {
		            System.out.println("Enter name for student " + (i + 1) + ":");
		            names[i] = in.next();

		            System.out.println("Enter marks for student " + (i + 1) + " (mark1 mark2 mark3):");
		            for (int j = 0; j < 3; j++) {
		                marks[i][j] = in.nextInt();
		            }

		            
		            totals[i] = marks[i][0] + marks[i][1] + marks[i][2];
		            averages[i] = totals[i] / 3;

		           
		            results[i] = averages[i] >= 40 ? 'P' : 'F';

		            
		            if (averages[i] >= 80) {
		                grades[i] = "A";
		            } else if (averages[i] >= 75) {
		                grades[i] = "B+";
		            } else if (averages[i] >= 65) {
		                grades[i] = "B";
		            } else if (averages[i] >= 55) {
		                grades[i] = "C+";
		            } else if (averages[i] >= 50) {
		                grades[i] = "C";
		            } else if (averages[i] >= 40) {
		                grades[i] = "D";
		            } else {
		                grades[i] = "F";
		            }
		        }

		        DecimalFormat decimalFormat = new DecimalFormat("0.0");

		        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		        System.out.println("                                 STUDENT MARKLIST                                    ");
		        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		        System.out.println("ROLL  NAME          MARK1      MARK2      MARK3    TOTAL    RESULT    Average      GRADE");

		       
		        for (int i = 0; i < numStudents; i++) {
		            int rollNumber = 101 + i;
		            System.out.println(rollNumber + "   " + names[i] + "         " + marks[i][0] + "         " + marks[i][1] + "           " +
		                    marks[i][2] + "      " + totals[i] + "        " + results[i] + "        " + averages[i] + "        " + grades[i]);
		       }
		    }
		


	}


