import java.util.Arrays;

public class PackingSlip implements SlipStrategy {

    @Override
    public void printDescription(Composite obj) {
        for (Component component: obj.components){
            String pslip = component.printDescription();
            String lines[] = pslip.split("[\\r\\n]+");

            if (lines.length > 1){
                Arrays.sort(lines, 1, lines.length);
                for (int i = 0; i < lines.length; i++) {
                    System.out.println(lines[i]);
                }
            }
            else {
                for (int i = 0; i < lines.length; i++) {
                    System.out.println(lines[i]);
                }
            }
        }
    }
}
