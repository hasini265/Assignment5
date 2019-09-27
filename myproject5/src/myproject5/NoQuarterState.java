package myproject5;

public class NoQuarterState implements State {
	
	CandyVendingMachine candyvendingMachine;
	 
	    public NoQuarterState(CandyVendingMachine candyvendingMachine) {
	        this.candyvendingMachine = candyvendingMachine;
	    }
	 
		public void insertQuarter() {
			System.out.println("You inserted a quarter");
			candyvendingMachine.setState(candyvendingMachine.getHasQuarterState());
		}
	 
		public void ejectQuarter() {
			System.out.println("You haven't inserted a quarter");
		}
	 
		public void turnCrank() {
			System.out.println("You turned, but there's no quarter");
		 }
	 
		public void dispense() {
			System.out.println("You need to pay first");
		} 
		
		public String toString() {
			return "Waiting for quarter";
		}
		
}
