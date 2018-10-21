  

public class BuildOrder {

    public static Component getOrder()
    {        Composite order = new Composite( "Order" ) ;

        // 1st
        CustomBurger customBurger1 = new CustomBurger( "Build Your Own Burger" ) ;
        // 1/2 lb
        Burger burger1 = new Burger( "Burger Options" ) ;
        String[] burgerOptions1 = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        burger1.setOptions( burgerOptions1 ) ;

        // extra cheese +1.00
        Cheese cheese1 = new Cheese( "Cheese Options" ) ;
        String[] cheeseOptions1 = {  "Yellow American","Spicy Jalapeno Jack"} ;
        cheese1.setOptions( cheeseOptions1 ) ;
        cheese1.wrapDecorator( burger1 ) ;

        // premium cheese +1.50
        PremiumCheese premiumCheese1 = new PremiumCheese( "Cheese Options" ) ;
        String[] premiumCheeseOptions1 = { "Danish Blue Cheese" } ;
        premiumCheese1.setOptions( premiumCheeseOptions1 ) ;
        premiumCheese1.wrapDecorator( cheese1 ) ;

        // extra sauce +0.50
        Sauce sauce1 = new Sauce( "Sauce Options" ) ;
        String[] souceOptions1 = { "Mayonnaise" , "Thai Peanut Sauce"} ;
        sauce1.setOptions( souceOptions1 ) ;
        sauce1.wrapDecorator( premiumCheese1 ) ;

        // toppings free
        Toppings toppings1 = new Toppings( "Toppings Options" ) ;
        String[] toppingOptions1 = { "Dill Pickle Chips","Black Olives","Spicy Pickles" } ;
        toppings1.setOptions( toppingOptions1 ) ;
        toppings1.wrapDecorator( sauce1 ) ;

        // premium topping +1.50
        Premium premiumToppings1 = new Premium( "Premium Options" ) ;
        String[] premiumToppingOptions = { "Marinated Tomatoes" } ;
        premiumToppings1.setOptions( premiumToppingOptions ) ;
        premiumToppings1.wrapDecorator( toppings1 ) ;

        // Bun
        Bun bun1= new Bun( "Bun Options" ) ;
        String[] bunOptions1 = { "Ciabatta(Vegan)" } ;
        bun1.setOptions( bunOptions1 ) ;
        bun1.wrapDecorator( premiumToppings1) ;

        // extra side +3.00
        Side side1= new Side( "Side Options" ) ;
        String[] sideOptions1 = { "Shoestring Fries" } ;
        side1.setOptions( sideOptions1 ) ;
        side1.wrapDecorator( burger1) ;

        // Setup Custom Burger 1 Ingredients
        customBurger1.setDecorator( side1 ) ;
        customBurger1.addChild( burger1 ) ;
        customBurger1.addChild( cheese1 ) ;
        customBurger1.addChild( premiumCheese1 ) ;
        customBurger1.addChild( sauce1 ) ;
        customBurger1.addChild( toppings1 ) ;
        customBurger1.addChild( premiumToppings1 ) ;
        customBurger1.addChild( bun1 ) ;
        customBurger1.addChild( side1 ) ;

        // 2nd
        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        // 1/3 lb
        Burger burger2 = new Burger( "Burger Options" ) ;
        String[] burgerOptions2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        burger2.setOptions( burgerOptions2 ) ;

        Cheese cheese2 = new Cheese( "Cheese Options" ) ;
        String[] cheeseOptions2 = {  "Smoked Gouda","Greek Feta"} ;
        cheese2.setOptions( cheeseOptions2 ) ;
        cheese2.wrapDecorator( burger2 ) ;

        PremiumCheese premiumCheese2 = new PremiumCheese( "Cheese Options" ) ;
        String[] premiumCheeseOptions2 = { "Fresh Mozzarella" } ;
        premiumCheese2.setOptions( premiumCheeseOptions2 ) ;
        premiumCheese2.wrapDecorator( cheese2 ) ;

        Sauce sauce2 = new Sauce( "Sauce Options" ) ;
        String[] sauceOptions2 = { "Habanero Salsa" } ;
        sauce2.setOptions( sauceOptions2 ) ;
        sauce2.wrapDecorator( premiumCheese2 ) ;

        Toppings toppings2 = new Toppings( "Toppings Options" ) ;
        String[] toppingOptions2 = { "Crushed Peanuts" } ;
        toppings2.setOptions( toppingOptions2 ) ;
        toppings2.wrapDecorator( sauce2 ) ;

        Premium premiumToppings2 = new Premium( "Premium Options" ) ;
        String[] premiumToppingOptions2 = { "Sunny Side Up Egg*","Marinated Tomatoes" } ;
        premiumToppings2.setOptions( premiumToppingOptions2 ) ;
        premiumToppings2.wrapDecorator( toppings2 ) ;

        Bun bun2= new Bun( "Bun Options" ) ;
        String[] bunOptions2 = { "Gluten-Free Bun" } ;
        bun2.setOptions( bunOptions2 ) ;
        bun2.wrapDecorator( premiumToppings2) ;

        Side side2= new Side( "Side Options" ) ;
        String[] sideOptions2 = { "Shoestring Fries" } ;
        side2.setOptions( sideOptions2 ) ;
        side2.wrapDecorator( bun2) ;

        // Setup Custom Burger 2 Ingredients
        customBurger2.setDecorator( side2 ) ;
        customBurger2.addChild( burger2 ) ;
        customBurger2.addChild( cheese2 ) ;
        customBurger2.addChild( premiumCheese2 ) ;
        customBurger2.addChild( sauce2 ) ;
        customBurger2.addChild( toppings2 ) ;
        customBurger2.addChild( premiumToppings2 ) ;
        customBurger2.addChild( bun2 ) ;
        customBurger2.addChild( side2 ) ;

        // Add Custom Burgers to the Order
        order.addChild( customBurger1 );
        order.addChild( customBurger2 );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/