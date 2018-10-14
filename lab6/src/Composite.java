import java.util.ArrayList;

public class Composite implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;

    public Composite ( String d )
    {
        description = d ;
    }

    public String printDescription() {
        String des = description + "\n";
        for (Component component : components){
            des += component.printDescription() + "\n";
        }
        return des;
    }

    public void addChild(Component c) {
        components.add( c ) ;
    }

    @Override
    public float getPrice() {
        return 0;
    }

}