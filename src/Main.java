public class Main {
    public static void main(String[] args) {
        System.out.println("Adding books to Library...\n");


        Book book1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
        Book book2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
        Book book3 = new Book("Web Development", "Mike Johnson", "5555666677", 2021);


        Library library = new Library();


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        library.displayAllBooks();

        System.out.println("\nBorrowing Java Programming...");
        if (library.borrowBook("1234567890")) {
            System.out.println("Book borrowed successfully!\n");
        } else {
            System.out.println("Book is not available for borrowing.\n");
        }


        System.out.println("Trying to borrow Java Programming again...");
        if (library.borrowBook("1234567890")) {
            System.out.println("Book borrowed successfully!\n");
        } else {
            System.out.println("Book is not available for borrowing.\n");
        }


        library.displayAvailableBooks();


        System.out.println("\nReturning Java Programming...");
        if (library.returnBook("1234567890")) {
            System.out.println("Book returned successfully!\n");
        } else {
            System.out.println("Book was already returned.\n");
        }


        library.displayAvailableBooks();


        System.out.println("\nTesting validation...");
        try {
            Book invalidBook = new Book("Invalid Book", "Unknown", "12345", 1400);  // Invalid year
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid year provided. Year must be between 1450 and 2025.");
        }

        try {
            Book invalidIsbnBook = new Book("Another Invalid Book", "Unknown", "12345", 2020);  // Invalid ISBN
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid ISBN. ISBN must be 10 or 13 characters long.");
        }
    }
}
