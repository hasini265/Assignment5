package myproject5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase2 {

	@Test
	
	void testSoldOut() {
		
		CandyVendingMachine candyvendingMachine = 
				new CandyVendingMachine(1);
		
        System.out.println(candyvendingMachine);
		
        candyvendingMachine.insertQuarter();
        candyvendingMachine.turnCrank();
        candyvendingMachine.insertQuarter();
        candyvendingMachine.turnCrank();
        candyvendingMachine.getSoldOutState();
        assertFalse(candyvendingMachine.count==1);
        		
	}

}
