import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		
	    //initialization of passenger LL
        LinkedList<Passenger> PassLL = new LinkedList<Passenger>();

        System.out.println("Welcome to the airline reservation system.");
        
        //destination options and user input 
        System.out.println("Here are our destinations");
    
        for(int i = 0; i < Destinations.destinations.length; i++){
          System.out.println(Destinations.destinations[i]);
        }
    
        Scanner input = new Scanner(System.in);
        System.out.println("Where would you like to go?");
        String destination = input.nextLine();
        
        //additional option is plane is full
        if(generateRandom.prand == 71) {
        	System.out.println("Sorry, the soonest flight to" + destination + "is full. The next one is in 6 hours. If that does not work for you, we apologize for the inconvenience.");
        }
        
        //initialization of time variable to print out to the ticket 
        String time = "10:30";
        
        	if(destination.equals("Manchester")) {
        		time = "13:30";}
        	
        		else if(destination.equals("Toronto")) {
        			time = "14:00";}
        		
        			else if(destination.equals("Male")) {
        				time = "15:30";}
        			
        				else if(destination.equals("London")) {
        					time = "16:30";}
        				
        					else if(destination.equals("Dubai")) {
        						time = "16:45";}
        					
        						else if(destination.equals("New York")) {
        							time = "17:00";}
        						
        							else if(destination.equals("Beirut")) {
        								time = "17:30";}
            						
            							else if(destination.equals("Los Angeles")) {
            								time = "17:45";}
                						
                							else if(destination.equals("Istanbul")) {
                								time = "18:00";}
                    						
                    							else if(destination.equals("Kuala Lumpur")) {
                    								time = "18:30";}
        
        //asking for preferred class, and while-loop asking again in case the chosen class is full
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter your preferred class.");
        String clasz = input2.nextLine();
        
        int erand = generateRandom.erand; 
    	int brand = generateRandom.brand;
    	int frand = generateRandom.frand;
    	
        while(true) {
            if(erand == 45 && clasz.equals("Economy")) {
                System.out.println("I'm sorry, economy is full. Please choose another class.");}
            
            else if(brand < 18 && clasz.equals("Business")) {
            	System.out.println("I'm sorry, business is full. Please choose another class.");}
            
            else if(frand < 8 && clasz.equals("First")) {
            	System.out.println("I'm sorry, first is full. Please choose another class.");}
            
            clasz = input2.nextLine();
            
            if(erand < 30 && clasz.equals("Economy")) {     	
                break;}
            
            else if(brand < 18 && clasz.equals("Business")) {  	
            	break;}
            
            else if(frand < 8 && clasz.equals("First")) {    	
            	break;}
        }    
        
        //initialization of ticket variable and asking the user for their information the 
        //same number of times as the variable 
        Scanner input6 = new Scanner(System.in);
        System.out.println("How many tickets would you like to book?");
        int tickets = input6.nextInt();

        for(int j = 0; j < tickets; j++){
          Scanner input7 = new Scanner(System.in); 
          System.out.println("Please enter your full name: ");
          String fullName = input7.nextLine(); 

          Scanner input8 = new Scanner(System.in); 
          System.out.println("Please enter your DOB in dd/mm/yyyy format: ");
          String DOB = input8.nextLine(); 

          Scanner input9 = new Scanner(System.in); 
          System.out.println("Please enter your passport nationality: ");
          String Nationality = input9.nextLine(); 

          Scanner input10 = new Scanner(System.in); 
          System.out.println("Please enter your passport number: ");
          int ppNum = input10.nextInt(); 
          
          //creation of passenger objects to the linked lists with the information as their attributes during runtime
          PassLL.add(new Passenger(fullName, DOB, Nationality, ppNum));
        }        
        
        //asking for travel and return date
        Scanner input11 = new Scanner(System.in);
        System.out.println("Please enter the travel date in dd/mm/yy format: ");
        String tdate = input11.nextLine();

        Scanner input12 = new Scanner(System.in);
        System.out.println("Please enter the return date in dd/mm/yy format: ");
        String rdate = input12.nextLine();
        
        //displaying seat map
        System.out.println("First");
        System.out.println("1A 1B   1C 1D");
        System.out.println("2A 2B   2C 2D");
        System.out.println("Business");
        System.out.println("3A 3B 3C   3D 3E 3F");
        System.out.println("4A 4B 4C   4D 4E 4F");        
        System.out.println("5A 5B 5C   5D 5E 5F");     
        System.out.println("Economy");
        System.out.println("6A 6B 6C   6D 6E 6F   6G 6H 6I");
        System.out.println("7A 7B 7C   7D 7E 7F   7G 7H 7I");
        System.out.println("8A 8B 8C   8D 8E 8F   8G 8H 8I");
        System.out.println("9A 9B 9C   9D 9E 9F   9G 9H 9I");
        System.out.println("10A 10B 10C   10D 10E 10F   10G 10H 10I");
        
        //creation of linked list and asking the user for a seat the same number of times 
        //as the ticket variable, adding the seat number to the linked list as an object.   
        LinkedList<Seat> seatsList = new LinkedList<Seat>(); 
    
        Scanner input13 = new Scanner(System.in); 
    
        for(int j = 0; j < tickets; j++){
          System.out.println("Please enter the seat number.");
          String seatSelect = input13.nextLine(); 
          Seat newSeat = new Seat(seatSelect); 
          seatsList.add(newSeat); 
          }
        
        //creation of text file called "ticket"
        File ticket = new File("ticket");
        
        FileWriter fw = new FileWriter(ticket);
        
        PrintWriter pw = new PrintWriter(fw);
        
        //printing out all relevant information to the ticket 
        pw.println("You are going to " + destination + " on " + tdate + " and returning on " + rdate);
        
        pw.println("You will be traveling in " + clasz + " class.");
        
        pw.println("Passenger information:");
        
        pw.println(PassLL.toString());
        
        pw.println("Your seats are:");
        
        pw.println(seatsList.toString());
        
        pw.println("Your flight is at " + time);
        
        if(clasz.equals("First")) {
        	pw.println("Your total cost of travel is " + tickets * 600 + " OMR.");
        }
        
        else if(clasz.equals("Business")) {
        	pw.println("Your total cost of travel is " + tickets * 300 + " OMR.");
        }
        
        else if(clasz.equals("First")) {
        	pw.println("Your total cost of travel is " + tickets * 200 + " OMR.");
        }
        
        pw.close();
        
	}
		
	}
