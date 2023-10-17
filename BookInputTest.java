import java.util.Scanner;
public class BookInputTest {
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        Book kitabu=new Book();
        
        System.out.println("Please enter the title of the book");
        kitabu.title=scanner.nextLine();
        System.out.println("Please enter the author name");
        kitabu.author=scanner.nextLine();
        System.out.println("Please enter the number of pages");
        kitabu.numberOfPages=scanner.nextInt();
        System.out.println("The book title is:"+kitabu.title);
        System.out.println("The book author is:"+kitabu.author);
        System.out.println("The book has  "  +kitabu.numberOfPages +  "pages");





        
        
        

		
	}
	

}
