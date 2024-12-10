import java.util.ArrayList;

public class DeleteBooks{

    public static void deleteBook(ArrayList<Books> books, int id){
        boolean deleted = false;
        for (Books book : books){
            if (book.getID() == id){
                books.remove(book);
                deleted = true;
                break;
            }
        }
        if (deleted){
            System.out.println("Book with ID: " + id + " has been deleted successfully.");
        } else {
            System.out.println("Could not find a book with ID: " + id + ".");
        }
    }
}
