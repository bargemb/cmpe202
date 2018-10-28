public class CardCVVDecorator implements IDecorator {
    @Override
    public String display(String key) {
        if ( key.equals("") )
            return "[123]" + "  " ;
        else
            return "[" + key + "]" + "  " ;
    }
}
