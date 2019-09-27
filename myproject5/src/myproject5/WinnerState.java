package myproject5;

public class WinnerState implements State {
	
	CandyVendingMachine candyvendingMachine;
	 
    public WinnerState(CandyVendingMachine candyvendingMachine) {
        this.candyvendingMachine = candyvendingMachine;
    }
 
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a candy");
	}
 
	public void ejectQuarter() {
		System.out.println("Please wait, we're already giving you a candy");
	}
 
	public void turnCrank() {
		System.out.println("Turning again doesn't get you another candy");
	}
 
	public void dispense() {
		
		System.out.println("YOU'RE A WINNER! You got two candies for your quarter");
		candyvendingMachine.releaseBall();
		if (candyvendingMachine.getCount() == 0) {
			candyvendingMachine.setState(candyvendingMachine.getSoldOutState());
		} else {
			candyvendingMachine.releaseBall();
			if (candyvendingMachine.getCount() > 0) {
				candyvendingMachine.setState(candyvendingMachine.getNoQuarterState());
			} else {
            	System.out.println("Oops, out of candies!");
            	candyvendingMachine.setState(candyvendingMachine.getSoldOutState());
			}
		}
	}
	
	public String toString() {
		return "dispensing two candies for your quarter, because YOU'RE A WINNER!";
	}

}
