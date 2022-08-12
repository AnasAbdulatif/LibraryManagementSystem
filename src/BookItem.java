
public class BookItem {
    private String ID;
    private Boolean Borrowed;
    private String DueDate;
    private double Price;
    private BookFormatEnum Format;
    private BookStatusEnum Status;

    
    public String getDueDate() {
        return DueDate;
    }

    public void setDueDate(String DueDate) {
        this.DueDate = DueDate;
    }


    public void setPrice(double Price) {
        this.Price = Price;
    }

    public BookFormatEnum getFormat() {
        return Format;
    }

    public void setFormat(BookFormatEnum Format) {
        this.Format = Format;
    }

    public BookStatusEnum getStatus() {
        return Status;
    }

    public void setStatus(BookStatusEnum Status) {
        this.Status = Status;
    }

 
    
    public Boolean Checkout(){
    return true;
    }
    
    public Boolean Copy(){
    return true;
    } 
    
}
