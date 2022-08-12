
import java.util.Scanner;


public class RoomReservation  {
    public int ReservationId;
    public String roomReservationLetter;
     public int numOfStudents;
    public String Time;
    public int Duration;
    

    public RoomReservation(int ReservationId, String roomReservationLetter, int numOfStudents, String Time, int Duration) {
        this.ReservationId = ReservationId;
        this.roomReservationLetter = roomReservationLetter;
        this.numOfStudents = numOfStudents;
        this.Time = Time;
        this.Duration = Duration;
        
        
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int Duration) {
        this.Duration = Duration;
    }

   
    
    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public String getRoomLetter() {
        return roomReservationLetter;
    }

    public void setRoomLetter(String roomLetter) {
        this.roomReservationLetter = roomLetter;
    }

    
    
   
   
    
}

