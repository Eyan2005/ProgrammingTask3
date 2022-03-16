public class Passenger {
	
	//passenger attributes 
	String fullName;
	String DOB;
	String Nationality;
	int ppNum;
	
	//overriding the toString method so it prints out the elements of PassLL
	@Override
	public String toString() {
		return fullName + ", " + DOB + ", " + Nationality + ", " + ppNum; 
	}
	
	//passenger constructor 	  
	public Passenger(String f, String d, String n, int p){ 
	  this.fullName = f; 
	  this.DOB = d; 
	  this.Nationality = n;
	  this.ppNum = p; 
	  }







}
