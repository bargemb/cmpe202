public class CardExpDecorator implements IDecorator {
    @Override
    public String display(String key) {
        String result = "[";
        if ( key.equals("") ){
            result +=  "MM/YY";
        }
        else {
            for (int i = 0; i < key.length(); i++) {
                result += key.charAt(i);
                if(i == 1)
                {
                    result += "/";
                }
            }
        }
        return result + "] ";
    }
}
