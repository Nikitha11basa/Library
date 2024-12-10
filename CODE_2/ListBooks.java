import java.util.ArrayList;
import java.util.Comparator;

public class ListBooks {

    public static void listBooks(ArrayList <Books> books, String sortBy){
        if (books.isEmpty()) {
            System.out.println("\n There are no books added yet.");
        } else {
            
            Comparator<Books> comparator;
            switch (sortBy) {
                case "author":
                    comparator = Comparator.comparing(Books::getAuthor);
                    break;
                case "title":
                    comparator = Comparator.comparing(Books::getTitle);
                    break;
                case "year":
                    comparator = Comparator.comparingInt(Books::getYear);
                    break;
                default:
                    System.out.println("Invalid sorting option. Books will be sorted by ID.");
                    comparator = Comparator.comparingInt(Books::getID);
                    break;
            }           
                books.sort(comparator);
                } 

            System.out.println("\nBook List:\n");
            for (Books book : books) {
                System.out.println("ID: " + book.getID() + "\n" + "Title: " + book.getTitle() + "\n" + "Author: " + book.getAuthor() + "\n" + "Publish Date: " + book.getYear());
                System.out.println("==============================");
            }
        }
    }
    