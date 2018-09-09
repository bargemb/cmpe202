
import java.util.Arrays;

public class GumballMachine
{

    private int numGumball;
    private int costPerGumball;
    private int[] canAccept;
    private int hasMoney;

    public GumballMachine(int size, int cost, int[] canAccept)
    {
        // initialise instance variables
        this.numGumball = size;
        this.costPerGumball = cost;
        this.canAccept = canAccept;
        this.hasMoney = 0;

    }

    public void insertCoin(int coin)
    {
        Arrays.sort(this.canAccept);
        if (Arrays.binarySearch(this.canAccept, coin) >= 0){
            this.hasMoney += coin;
            System.out.println(coin + " cents inserted");
        }
        else {
            System.out.println("Acceptable coins to this Gumball are " +
                    Arrays.toString(this.canAccept));
        }
    }

    public void turnCrank()
    {
    	if ( this.costPerGumball == this.hasMoney )
    	{
    		if ( this.numGumball > 0 )
    		{
    			this.numGumball-- ;
    			System.out.println( "Thanks for your " + this.hasMoney + " cents.  Gumball Ejected!" );
                this.hasMoney = 0;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your money." );
    		}
    	}
    	else
    	{
    		System.out.println( "Please insert total of " + this.costPerGumball + " cents");
    	}
    }
}
