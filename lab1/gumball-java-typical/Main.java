
public class Main {
	public static void main(String[] args) {

        GumballMachine gumballMachine1 = new GumballMachine(1, 25, new int[]{25});
        GumballMachine gumballMachine2 = new GumballMachine(15, 50, new int[]{25});
        GumballMachine gumballMachine3 = new GumballMachine(15, 50, new int[]{5, 10, 25});

        //Operations with first machine
        gumballMachine1.insertCoin(25);
        gumballMachine1.insertCoin(50);
        gumballMachine1.turnCrank();
        gumballMachine1.insertCoin(25);
        gumballMachine1.turnCrank();

        System.out.println();

        //Operations with third machine
        gumballMachine3.insertCoin(25);
        gumballMachine3.turnCrank();
        gumballMachine3.insertCoin(10);
        gumballMachine3.insertCoin(10);
        gumballMachine3.insertCoin(5);
        gumballMachine3.turnCrank();

	}
}
