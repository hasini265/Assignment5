package myproject5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase1 {

	@Test
	void testNoQuarter() {
		
		CandyVendingMachine candyvendingMachine = 
				new CandyVendingMachine(10);
		
        System.out.println(candyvendingMachine);
		
        candyvendingMachine.insertQuarter();
        candyvendingMachine.ejectQuarter();
		candyvendingMachine.turnCrank();
		assertTrue(candyvendingMachine.count==10);
		
	}

}
