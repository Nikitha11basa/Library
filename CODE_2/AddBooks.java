import java.util.Scanner;
import java.util.ArrayList;

public class AddBooks {

    public static void addBook(ArrayList<Books> books, Scanner sc){
        Books book = new Books(); 
        int ID;
        
        System.out.println("Enter book ID: ");
        ID = sc.nextInt();

        for (Books IDBooks : books){
            if (IDBooks.getID() == ID){
            System.out.println("Book with ID " + ID + " already exists.");
            return;
        }
    }   
        book.setID(ID);

        System.out.println("Enter book title: ");
        sc.nextLine();
        book.setTitle(sc.nextLine());

        System.out.println("Enter book author: ");
        book.setAuthor(sc.nextLine());

        System.out.println("Enter publish year: ");
        book.setYear(sc.nextInt());

        books.add(book);

        System.out.println("\n" + "Book successfully added: '" + book.getTitle() + "' by: " + book.getAuthor() + ", written in " + book.getYear() + 
        ", with ID number: " + book.getID() + "\n");
 
    }   
    
}