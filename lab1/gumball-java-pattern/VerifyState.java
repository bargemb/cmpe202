public class VerifyState implements State {
    GumballMachine gumballMachine;

    public VerifyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin() {
        System.out.println("You inserted a coin");
    }

    public void ejectCoin() {
        System.out.println("Coins returned");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getVerifyState());
    }

    public void dispense() {
        if (gumballMachine.getCoinSum() == gumballMachine.costPerGumball){
            gumballMachine.setState(gumballMachine.getSoldState());
            System.out.println("Verification complete");
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoCoinState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
        else{
            gumballMachine.setState(gumballMachine.getVerifyState());
            System.out.println("Coin mismatch");
        }
    }

    public String toString() {
        return "waiting for turn of crank";
    }
}
