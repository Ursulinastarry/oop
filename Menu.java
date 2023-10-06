		import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);
		        int choice;

		        while (true) {
		            System.out.println("Carrier info");
		            System.out.println("1: Sh10 (15Mins, 1hr)");
		            System.out.println("2: Sh20 (15Mins, midnight)");
		            System.out.println("3: Okoa 50");
		            System.out.println("4: Okoa 20");
		            System.out.println("5: Okoa 10");  
		            System.out.println("6: Okoa 5");
		            System.out.println("7: Okoa 20 (900MB, 1hr)"); 
		            System.out.println("8: Okoa Internet");
		            System.out.println("0: More");
		            System.out.println("Enter your choice: ");

		            choice = scanner.nextInt();

		            switch (choice) {
		                case 0:
		                    int subChoice;
		                    while (true) {
		                        System.out.println("carrier info");
		                        System.out.println("1.check balance");
		                        System.out.println("2.Lipa okoa");
		                        System.out.println("0.BACK");
		                        System.out.println("Enter your choice:");


		                        subChoice = scanner.nextInt();

		                        if (subChoice == 0) {
		                            break; // Go back to the previous page
		                        } else if (subChoice == 1) {
		                            
		                            System.out.println("A message containing your balance has been sent to your inbox.");
		                        } else if (subChoice == 2) {
		                            
		                            System.out.println("lipa from:");
		                            System.out.println("1.Airtime");
				                    System.out.println("2.M-PESA");

		                        } else {
		                            System.out.println("Invalid choice. Try again.");
		                        }
		                    }
		                    break;
		                case 1:
		                   System.out.println("Your request has been received.Kindly wait for our response.");

		                    break;
		                case 2:
			                   System.out.println("Your request has been received.Kindly wait for our response.");

		                	 break;
		                case 3:
			                   System.out.println("Your request has been received.Kindly wait for our response.");

		                    break;
		                case 4:
			                   System.out.println("Your request has been received.Kindly wait for our response.");

		                    break;
		                case 5:
			                   System.out.println("Your request has been received.Kindly wait for our response.");

		                    break;
		                case 6:
			                   System.out.println("Your request has been received.Kindly wait for our response.");

		                    break;
		                case 7:
			                   System.out.println("Your request has been received.Kindly wait for our response.");

		                    break;
		                case 8:
			                   System.out.println("Your request has been received.Kindly wait for our response.");

		                    break;
		                
		                  
		                default:
		                    System.out.println("Invalid choice. Try again.");
		            }
		        }
		    }
		


	}


