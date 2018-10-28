public class CardNumberDecorator implements IDecorator {

    @Override
    public String display(String key) {
        String result = "[";
        if ( key.equals("") ){
            result +=  "4444 4444 4444 4444";
        }
        else {
            for (int i = 0; i < key.length(); i++) {
                result += key.charAt(i);
                if((i+1)%4 == 0 && i != 15) {
                    result += " ";
                }
            }
        }
        return result + "] ";
    }
}
