package week2.pizza;

// the Client
public class PizzaMaker {
    public static void main(String[] args){
        // create a basic pizza with mozzarella & tomatosauce
        TomatoSauce basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        basicPizza.setSize(ToppingDecorator.Size.L);

        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getTotalCost());
    }
}

