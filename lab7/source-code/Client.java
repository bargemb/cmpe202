  

public class Client {

    public static void main(String[] args) {
        Component theOrder = BuildOrder.getOrder() ;
        theOrder.printDescription();
    }
//    public static void runTest()
//    {
//        Component theOrder = BuildOrder.getOrder() ;
//        theOrder.printDescription();
//    }
}
 
