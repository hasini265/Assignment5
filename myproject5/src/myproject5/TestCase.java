package myproject5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase {
		
	@Test
	void testHasQuarter() {
		
		CandyVendingMachine candyvendingMachine = 
				new CandyVendingMachine(10);
	
		
		System.out.println(candyvendingMachine);
		
		candyvendingMachine.insertQuarter();
		candyvendingMachine.insertQuarter();
		candyvendingMachine.turnCrank();
		candyvendingMachine.insertQuarter();
		candyvendingMachine.turnCrank();
		assertFalse(candyvendingMachine.count==10);
		
	}
	
}