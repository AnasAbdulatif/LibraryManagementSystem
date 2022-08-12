
import java.util.Scanner;


public class Book {
    public String Title;
    public int numberOfPages;
    public String Language;
    public String Subject;
    public String Author;
    public Double Price;
   public int BookNum;
    

    public String getTitle() {
        return Title;
    }

    public Book(Double Price) {
        this.Price = Price;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }
    Scanner input = new Scanner(System.in);

    
    public Book(String Title, int numberOfPages, String Language, String Subject, String Author,Double Price) {
        this.Title = Title;
        this.numberOfPages = numberOfPages;
        this.Language = Language;
        this.Subject = Subject;
        this.Author = Author;
        this.Price= Price;
    } 
}
