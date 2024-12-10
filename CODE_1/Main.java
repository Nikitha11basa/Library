import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add some books to the library
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
        library.addBook(new Book("1984", "George Orwell", "9780451524935"));
        library.addBook(new Book("Moby Dick", "Herman Melville", "9781503280786"));

        // Add some members to the library
        library.addMember(new Member("Alice", "M001"));
        library.addMember(new Member("Bob", "M002"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Show Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    library.showBooks();
                    break;

                case 2:
                    System.out.print("Enter Member ID: ");
                    String memberId = scanner.nextLine();
                    Member member = library.findMemberById(memberId);
                    if (member != null) {
                        System.out.print("Enter ISBN of the book you want to borrow: ");
                        String isbn = scanner.nextLine();
                        Book book = library.findBookByIsbn(isbn);
                        if (book != null) {
                            member.borrowBook(book);
                        } else {
                            System.out.println("Book not found.");
                        }
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Member ID: ");
                    memberId = scanner.nextLine();
                    member = library.findMemberById(memberId);
                    if (member != null) {
                        System.out.print("Enter ISBN of the book you want to return: ");
                        String returnIsbn = scanner.nextLine();
                        Book returnBook = library.findBookByIsbn(returnIsbn);
                        if (returnBook != null) {
                            member.returnBook(returnBook);
                        } else {
                            System.out.println("Book not found.");
                        }
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
