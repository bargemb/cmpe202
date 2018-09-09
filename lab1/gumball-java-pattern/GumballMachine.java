

public class GumballMachine {
 
	State soldOutState;
	State noCoinState;
	State hasCoinState;
	State soldState;
	State verifyState;
 
	State state = soldOutState;
	int count = 0;
    int costPerGumball;
    int[] canAccept;
    int coinSum;
 
	public GumballMachine(int numberGumballs, int cost, int[] canAccept) {
		soldOutState = new SoldOutState(this);
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		soldState = new SoldState(this);
		verifyState = new VerifyState(this);

		this.count = numberGumballs;
		this.costPerGumball = cost;
		this.canAccept = canAccept;

 		if (numberGumballs > 0) {
			state = noCoinState;
			coinSum = 0;
		} 
	}
 
	public void insertCoin(int coin) {
		state.insertCoin();
		this.coinSum += coin;
	}
 
	public void ejectCoin() {
		state.ejectCoin();
		this.coinSum = 0;
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}

	int getCoinSum(){
	    return coinSum;
    }
 
	void refill(int count) {
		this.count = count;
		state = noCoinState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getVerifyState() {
        return verifyState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
