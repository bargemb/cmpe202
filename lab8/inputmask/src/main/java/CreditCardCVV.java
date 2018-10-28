/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVV implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String cvv = "" ;
	private CardCVVDecorator cardCVVDecorator ;

    public CreditCardCVV() {
        this.cardCVVDecorator = new CardCVVDecorator();
    }

    public void setNext(IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
//		if ( cvc.equals("") )
//			return "[123]" + "  " ;
//		else
//			return "[" + cvc + "]" + "  " ;
        return cardCVVDecorator.display(cvv);
	}	

	public void key(String ch, int cnt) {
//		if ( cnt >= 21 ) {
//			if ( cnt >= 21 && cnt <= 23 )
//				cvc += ch ;
//			else if ( nextHandler != null )
//				nextHandler.key(ch, cnt) ;
//		}
        if ( cnt >= 21 || (cnt == 22 && ch.equalsIgnoreCase("x")) ) {
            if (ch.equalsIgnoreCase("x")) {
                if(cvv.length() > 0)
                    cvv = cvv.substring(0, cvv.length() -1);
            }
            else if ( cnt >= 21 && cnt <= 23 )
                cvv += ch ;
            else if ( nextHandler != null )
                nextHandler.key(ch, cnt) ;
        }
		
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}