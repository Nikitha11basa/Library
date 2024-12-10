import java.util.ArrayList;

public class ModifyBooks {

    public static void modifyBookTitle(ArrayList<Books> books, int id, String newTitle) {

        if (books.size() == 0) {
            System.out.println("There is no book in the list to modify. First add a book.");
            return;
        }

        boolean modified = false;
        for (Books book : books) {
            if (book.getID() == id) {
                book.setTitle(newTitle);
                modified = true;
                break;
            }
        }
        if (modified) {
            System.out.println("Book with ID " + id + " has been modified successfully.");
        } else {
            System.out.println("Could not find a book with ID " + id + ".");
        }
    }
}