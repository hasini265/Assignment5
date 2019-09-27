package myproject5;

public class SoldOutState implements State {
	
	CandyVendingMachine candyvendingMachine;
	 
	    public SoldOutState(CandyVendingMachine candyvendingMachine) {
	        this.candyvendingMachine = candyvendingMachine;
	    }
	 
		public void insertQuarter() {
			System.out.println("You can't insert a quarter, the machine is sold out");
		}
	 
		public void ejectQuarter() {
			System.out.println("You can't eject, you haven't inserted a quarter yet");
		}
	 
		public void turnCrank() {
			System.out.println("You turned, but there are no candies");
		}
	 
		public void dispense() {
			System.out.println("No candy is dispensed");
		}
		
		public String toString() {
			return "sold out";
		}
}
