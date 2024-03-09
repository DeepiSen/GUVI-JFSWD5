package Library;

import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the maximum number of books in Library"); //getting max number books value
        int maxSize = scanner.nextInt();
        Library library = new Library(maxSize);

        while(true){ //creating menu for the library operation
            System.out.println("Menu for the Library");
            System.out.println("1. Add the Book");
            System.out.println("2. Remove the Book");
            System.out.println("3.Search for a book");
            System.out.println("4. Display all the books");
            System.out.println("5.Exit");


            System.out.println("Enter your Choice"); //getting user choice
            int Choice = scanner.nextInt();

            switch(Choice){ // operation done based on the user choice
                case 1: //add book
                    System.out.println("Enter the bookId");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the Author name");
                    String Author = scanner.nextLine();
                    System.out.println("Enter the Title of Book");
                    String Title = scanner.nextLine();
                    Book newBook = new Book(bookId,Author,Title);
                    library.addBook(newBook);
                    break;
                case 2: // remove book
                    System.out.println("Enter the bookId");
                    bookId = scanner.nextInt();
                    library.removeBook(bookId);
                    break;
                case 3://search a book
                    System.out.println("Enter the bookId");
                    bookId = scanner.nextInt();
                    library.searchBook(bookId);
                    break;
                case 4: //display the book
                    System.out.println(library);
                    break;
                case 5: //exiting from the menu
                    System.out.println("Exiting from Library");
                    System.exit(0);
                default://default case for error handling
                    System.out.println("Invalid Option please give valid input");
                    break;
            }


        }

    }
}
