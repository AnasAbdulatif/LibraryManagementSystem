


public class Room {
    
    private String Letter;//Library Room code ie. Room G6
    private int Floor;//what floor the room being booked
    private int Size;//how many students the room can take
    

    public String getName() {
        return Letter;
    }

    public void setName(String Name) {
        this.Letter = Name;
    }

    public int getFloor() {
        return Floor;
    }

    public void setFloor(int Floor) {
        this.Floor = Floor;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public Room(String Name, int Floor, int Size) {
        this.Letter = Name;
        this.Floor = Floor;
        this.Size = Size;
    }
    
    
}
