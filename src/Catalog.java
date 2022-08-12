
import java.util.ArrayList;


public class Catalog {
   private int numberOfBooks;
   private ArrayList <Catalog> Catalog=new ArrayList();

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }
public Boolean CreateBook(){
    return true;
    
}
public Boolean UpdateCatalog(){
    return true;
    
}

    public Catalog(int numberOfBooks,ArrayList Catalog) {
        this.numberOfBooks = numberOfBooks;
        Catalog= new ArrayList();
    }

}
