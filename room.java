public class Room {
    public int RoomID;
    public boolean HasItem;
    public Room[] OtherRooms;
    public String RoomDescription;
    public String ItemDescription;
    public Item item;

    public Room(int _RoomID, boolean _HasItem, Room[] _OtherRooms, String _RoomDescription, String _ItemDescription) {

    }
    public Item getItem() {
        return item;
    }

}
