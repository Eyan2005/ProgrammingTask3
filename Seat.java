public class Seat {
	
	//attributes of the seat object  
	String seatNumber; 
	
	//overriding the toString method so it prints out the elements of seatsList 
	@Override
	public String toString() {
		return seatNumber; 
	}
	
	//seat constructor
	public Seat(String s ){

	  this.seatNumber = s;
	  }

}
