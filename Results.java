import java.util.Scanner;

public class Results {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter database code:");
        String da_code = in.next(); 

        System.out.println("enter database score");
        int da_score = in.nextInt();

        System.out.println("enter systems code");
        String sy_code = in.next(); 

        System.out.println("enter systems score");
        int sy_score = in.nextInt();

        System.out.println("enter algorithm code");
        String al_code = in.next(); 

        System.out.println("enter algorithm score");
        int al_score = in.nextInt();

        System.out.println("enter statistics code");
        String st_code = in.next(); 

        System.out.println("enter statistics score");
        int st_score = in.nextInt();

        int total = da_score + sy_score + al_score + st_score;

        double average = (double) total / 4; 

        // Determine the grade based on the average score
        char grade;
        if (average >= 70) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("               Department of Computer Science         ");
        System.out.println("                  End of Semester results         ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("|Name:paulina wambua  |Roll_No: C026-01-0947/2022   Semester:2.2");
        System.out.println("________________________________________________________________");
        System.out.println("|Unit code:   |Unit Name:       Score:");
        System.out.println("----------------------------------------------------------------");
        System.out.println("|" + da_code + "      |Database         |" + da_score);
        System.out.println("|" + sy_code + "      |Systems          |" + sy_score);
        System.out.println("|" + al_code + "      |Algorithm        |" + al_score);
        System.out.println("|" + st_code + "      |Statistics       |" + st_score);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|Total                          |" + total);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|Average                        |" + average);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|Grade                          |" + grade);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|              Recommendation   |");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Grading Criteria    Overall Grade(A-D)   Recommend Pass");
        System.out.println("70-100         A");
        System.out.println("60-69          B");
        System.out.println("50-59          C");
        System.out.println("40-49          D");
        System.out.println("Below 40       F");
        System.out.println("-----------------------------------------------------------------");
    }
}
