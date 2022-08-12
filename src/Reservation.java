
import java.util.ArrayList;


public class Reservation {
    private String CreationDate;
    private ReservationStatus Status;
    public String getCreationDate() {
        return CreationDate;
    }

    public void setCreationdate(String Creationdate) {
        this.CreationDate = Creationdate;
    }

    public ReservationStatus getStatus() {
        return Status;
    }

    public void setStatus(ReservationStatus Status) {
        this.Status = Status;
    }
   
    

    public Reservation(String CreationDate, ReservationStatus Status) {
        this.CreationDate = CreationDate;
        this.Status = Status;
    }
 
   }

