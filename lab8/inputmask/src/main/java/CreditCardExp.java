/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;
	private CardExpDecorator cardExpDecorator;

	public CreditCardExp(){
	    cardExpDecorator = new CardExpDecorator();
    }

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
//		if ( date.equals("") )
//			return "[MM/YY]" + "  " ;
//		else
//			return "[" + date + "]" + "  " ;
        return cardExpDecorator.display(date);
	}	

	public void key(String ch, int cnt) {
//		if ( cnt >= 17 && cnt <= 20  )
//			date += ch ;
//		else if ( nextHandler != null )
//			nextHandler.key(ch, cnt) ;
        if ( cnt >= 17 && cnt <= 20 || (cnt == 21 && ch.equalsIgnoreCase("x")) ) {
            if (ch.equalsIgnoreCase("x")) {
                if(date.length() > 0)
                    date = date.substring(0, date.length() -1);
            }
            else
                date += ch ;
        }
        else if ( nextHandler != null )
            nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}