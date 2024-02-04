package Library;

public class Book {
    int BookID;
    String Title,Author;
    Boolean IsAvailable;




    public Book(int BookID, String Author,String Title){
      this.BookID = BookID;
      this.Author = Author;
      this.Title = Title;
      this.IsAvailable = true;
    }

    public Book() {

    }

    public int getBookID() {
        return BookID;
    }
    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public Boolean getAvailable() {
        return IsAvailable;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setAvailable(Boolean available) {
        IsAvailable = available;
    }

    public String toString() {
        return "Book ID: " + BookID + ", Title: " + Title + ", Author: " + Author + ", Available: " + IsAvailable;
    }

}
