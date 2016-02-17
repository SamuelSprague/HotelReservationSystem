
public class Room {
	
	private int roomNumber;
	private int capacity;
	private double price;
	private boolean isFull = false;
	
	public Room(int roomNumber, int capacity, double price){
		
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.price = price;
	}
	
	public void setToFull(){
		this.isFull = true;
	}
	
	public boolean checkIfFull(){
		return isFull;
	}

}
