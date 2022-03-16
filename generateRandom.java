import java.util.*;
public class generateRandom {
	
	//instance of random
	static final Random rand = new Random(); 
	
	//upper bound variables of the class and plane capacity
    static final int eub = 46;
    static final int bub = 19;
    static final int fub = 9;
    static final int pub = 72;
    
    //random class current capacities reference the upper bounds     		
    static final int erand = rand.nextInt(eub); 
    static final int brand = rand.nextInt(bub); 
    static final int frand = rand.nextInt(fub); 
    static final int prand = rand.nextInt(pub); 

}
