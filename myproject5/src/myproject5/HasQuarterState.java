  package myproject5;

import java.util.Random;

public class HasQuarterState implements State {
	
	Random randomWinner = new Random(System.currentTimeMillis());
	CandyVendingMachine candyvendingMachine;
 
	public HasQuarterState(CandyVendingMachine candyvendingMachine) {
		this.candyvendingMachine = candyvendingMachine;
	}
  
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}
 
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		candyvendingMachine.setState(candyvendingMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (candyvendingMachine.getCount() > 1)) {
			candyvendingMachine.setState(candyvendingMachine.getWinnerState());
		} else {
			candyvendingMachine.setState(candyvendingMachine.getSoldState());
		}
	}

    public void dispense() {
        System.out.println("No candy dispensed");
    }
    	
}
