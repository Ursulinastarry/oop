package marklist;

import java.util.Scanner;

public class Marklist {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter your name:");
        String name1=in.next();
        
        System.out.println("enter mark1:");
        int mark01=in.nextInt();
        
        System.out.println("enter mark2:");
        int mark02=in.nextInt();
        
        System.out.println("enter mark3:");
        int mark03=in.nextInt();
        
        System.out.println("enter your name:");
        String name2=in.next();
        
        System.out.println("enter mark1:");
        int mark11=in.nextInt();
        
        System.out.println("enter mark2:");
        int mark12=in.nextInt();
        
        System.out.println("enter mark3:");
        int mark13=in.nextInt();
        
        System.out.println("enter your name:");
        String name3=in.next();
        
        System.out.println("enter mark1:");
        int mark21=in.nextInt();
        
        System.out.println("enter mark2:");
        int mark22=in.nextInt();
        
        System.out.println("enter mark3:");
        int mark23=in.nextInt();
        
        
        System.out.println("enter your name:");
        String name4=in.next();
        
        
        
        
        
       
        
       
        
        System.out.println("enter mark1:");
        int mark31=in.nextInt();
        
        
       
        
        
        
       
        System.out.println("enter mark2:");
        int mark32=in.nextInt();
        
        
        
        
        
       
        
        System.out.println("enter mark3:");
        int mark33=in.nextInt();
        
        int total1=mark01+mark02+mark03;
        int total2=mark11+mark12+mark13;
        int total3=mark21+mark22+mark23;
        int total4=mark31+mark32+mark33;
        double av1=total1/3;
        double av2=total2/3;
        double av3=total3/3;
        double av4=total4/3;
        char result;
        double av=av1;
        if (av>=40) {result='P';}
        else {result='F';}
        
        
        
        String grade;
        
        if (av >= 80) {
            grade = "A";
        } else if (av >= 75) {
            grade = "B+";
        } else if (av >= 65) {
            grade = "B";
        } else if (av >= 55) {
            grade = "C+";
        } else if (av>=50) {
            grade = "C";
        }else if (av>=40) {
        	grade="D";
        }else {grade="F";
        
        }




		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("                                 STUDENT MARKLIST                                    ");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("ROLL  NAME          MARK1      MARK2      MARK3    TOTAL    RESULT    Average      GRADE");
        System.out.println("101   "+name1+"         "+mark01+"         "+mark02+"           "+mark03+"      "+total1+"        "+result+"        "+av1+"        "+grade+"");
        System.out.println("102   "+name2+"         "+mark11+"         "+mark12+"           "+mark13+"      "+total2+"        "+result+"        "+av2+"        "+grade+"");
        System.out.println("103   "+name3+"         "+mark21+"         "+mark22+"           "+mark23+"      "+total3+"        "+result+"        "+av3+"        "+grade+"");
        System.out.println("104   "+name4+"         "+mark31+"         "+mark32+"           "+mark33+"      "+total4+"        "+result+"        "+av4+"        "+grade+"");



		

	}

}
