package myproject5;

public class SoldState implements State {
	
	CandyVendingMachine candyvendingMachine;
	 
    public SoldState(CandyVendingMachine candyvendingMachine) {
        this.candyvendingMachine = candyvendingMachine;
    }
       
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a candy");
	}
 
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another candy!");
	}
 
	public void dispense() {
		candyvendingMachine.releaseBall();
		if (candyvendingMachine.getCount() > 0) {
			candyvendingMachine.setState(candyvendingMachine.getNoQuarterState());
		} else {
			System.out.println("Oops, out of candies!");
			candyvendingMachine.setState(candyvendingMachine.getSoldOutState());
		}
	}
	
	public String toString() {
		return "dispensing a candy";
	}
	
}
