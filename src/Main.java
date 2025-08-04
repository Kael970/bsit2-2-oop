public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("OOP", "Ernesto Razo", 300);
        Book book2 = new Book("War and Peace", "Leo Tolstoy", 1225);
        Book book3 = new Book("1984", "George Orwell", 328);


        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();


        book1.borrowBook();
        book1.displayInfo();

        book1.returnBook();
        book1.displayInfo();
    }
}


class Book {

    String title;
    String author;
    int pages;
    boolean isAvailable;


    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;
        System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
    }


    public void displayInfo() {
        System.out.println("\nBook Info:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }


    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("\nYou have borrowed '" + title + "'.");
        } else {
            System.out.println("\nSorry, '" + title + "' is already borrowed.");
        }
    }


    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("\nYou have returned '" + title + "'.");
        } else {
            System.out.println("\n'" + title + "' was not borrowed.");
        }
    }
}