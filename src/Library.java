import java.util.ArrayList;


public class Library {
   private ArrayList <BookItem> ItemList=new ArrayList();
   private ArrayList <RoomReservation> RoomList=new ArrayList();
   private String Name;
   private String Address;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Library(String Name, String Address,ArrayList Items,ArrayList Rooms) {
        this.Name = Name;
        this.Address = Address;
        Items =new ArrayList();
        Rooms=new ArrayList();
    }
   
}
