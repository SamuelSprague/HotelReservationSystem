
public class CheckIn {
	
	private String guestName;
	private int numOfPeople;
	private String desiredRoomType;
	private boolean isInRoom;
	private HotelRoom hotelRoom;
	
	public CheckIn(String guestName, int numOfPeople, String desiredRoomType){
		
		this.guestName = guestName;
		this.numOfPeople = numOfPeople;
		this.desiredRoomtype = desiredRoomType;
		this.isInRoom = false;
		this.hotelRoom = null;
		
	}
	
	public void setInRoom(HotelRoom room){
		
		isInRoom = true;
		hotelRoom = room;
	}
	
	public String getGuestName(){
		return this.guestName;
	}
	
	public int getNumOfPeople(){
		return this.numOfPeople;
	}
	
	public String getRoomType(){
		return this.desiredRoomType;
	}

}
