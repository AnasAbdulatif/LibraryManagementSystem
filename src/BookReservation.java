
public class BookReservation extends Reservation {
    private int BookID;

    public BookReservation(int BookID, String CreationDate, ReservationStatus Status) {
        super(CreationDate, Status);
        this.BookID = BookID;
        
    }

    
    
}
