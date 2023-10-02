package weight;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);

 System.out.println("Enter your weight:");
 double weight = in.nextDouble();

 System.out.println("Enter your height:");
 double height = in.nextDouble();


 
 
 
 double bmi= weight / (height*height) ;
 
 System.out.println("Your BMI is:" +bmi);

 
	}

}
