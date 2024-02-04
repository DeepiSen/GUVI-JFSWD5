package Library;

import java.util.Arrays;

public class Library extends Book {

    private Book[] books; //array to store the book details
    int BookCount;

    public Library() { // default constructor
        super();

    }

    public Library(int maxSize){
        this.books = new Book[maxSize];
        this.BookCount=0;
    }

    public void addBook(Book book){
       if(BookCount < books.length){
           books[BookCount++] = book;
           System.out.println("Book added successfully");
       }else{
           System.out.println("Library is Full");
        }
    }

    public void removeBook(int bookId) {
        for (int i = 0; i < BookCount; i++) {
            if (books[i] != null && books[i].getBookID() == bookId) {
                for (int j = i; j < BookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[BookCount - 1] = null; // Mark the last element as null
                BookCount--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }
    public void searchBook(int bookId) {
        for (Book book : books) {
            if (book != null && book.getBookID() == bookId) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }
    public String toString() {
        StringBuilder result = new StringBuilder("Library Contents:\n");
        for (int i = 0; i < BookCount; i++) {
            result.append(books[i]).append("\n");
        }
        return result.toString();
    }
    /*public void display(){
        for(Book book : books){
            if(book != null){
                System.out.println(book);
            }
        }
    }*/


}
