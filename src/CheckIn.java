
public class CheckIn {
	
	private String guestName;
	private int numOfPeople;
	private String roomType;
	
	public CheckIn(String guestName, int numOfPeople, String roomType){
		
		this.guestName = guestName;
		this.numOfPeople = numOfPeople;
		this.roomType = roomType;
		
	}
	
	public String getGuestName(){
		return this.guestName;
	}
	
	public int getNumOfPeople(){
		return this.numOfPeople;
	}
	
	public String getRoomType(){
		return this.roomType;
	}

}
