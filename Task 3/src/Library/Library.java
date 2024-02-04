package Library;

import java.util.Arrays;

public class Library extends Book { //library class extending book class

    private Book[] books; //array to store the book details
    int BookCount;

    public Library() { // default constructor
        super();

    }

    public Library(int maxSize){ //parameterised costructor
        this.books = new Book[maxSize];
        this.BookCount=0;
    }

    public void addBook(Book book){ //method to add book in library
       if(BookCount < books.length){ //books can be added till the max number books
           books[BookCount++] = book;
           System.out.println("Book added successfully");
       }else{
           System.out.println("Library is Full");
        }
    }

    public void removeBook(int bookId) { //method to remove the specific boo with bookid
        for (int i = 0; i < BookCount; i++) {
            if (books[i] != null && books[i].getBookID() == bookId) {
                for (int j = i; j < BookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[BookCount - 1] = null; // Mark the last element as null
                BookCount--; //decrementing bookcount
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }
    public void searchBook(int bookId) { //method to search a specific book with bookid
        for (Book book : books) {
            if (book != null && book.getBookID() == bookId) {
                System.out.println(book); //returns a book details with mentioned bookid
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }
    public String toString() { // to get book details in meaningful format
        StringBuilder result = new StringBuilder("Library Contents:\n");
        for (int i = 0; i < BookCount; i++) {
            result.append(books[i]).append("\n");
        }
        return result.toString();
    }


}
