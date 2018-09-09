public class HasCoinState implements State {
	GumballMachine gumballMachine;
 
	public HasCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoin() {
		System.out.println("You inserted a another coin");
		gumballMachine.setState(gumballMachine.getHasCoinState());
	}
 
	public void ejectCoin() {
		System.out.println("Coins returned");
		gumballMachine.setState(gumballMachine.getNoCoinState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...verifying");
		gumballMachine.setState(gumballMachine.getVerifyState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
