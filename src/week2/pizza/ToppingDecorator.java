package week2.pizza;

// Abstract Decorator
abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza;
    
    public ToppingDecorator(Pizza newPizza) {
        tempPizza = newPizza;
    }
    
    public String getDescription() {
        return tempPizza.getDescription();
    }

    private Size size = Size.M;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public enum Size {
        L(1.2f), M(1f), S(.8f);

        float multiplier;

        Size(float multiplier) {
            this.multiplier = multiplier;
        }
    }

    public double getTotalCost() {
        return getCost() * this.size.multiplier;
    }


    public double getCost() {
        return tempPizza.getCost();
    }
}
