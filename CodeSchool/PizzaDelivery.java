package CodeSchool;

public class PizzaDelivery {
    public Stack deliveryGal;
    public Stack pizzaHouse;

    public PizzaDelivery() {
        this.deliveryGal = new Stack(5);
        this.pizzaHouse = new Stack();

    }

    public void assign(String [] pizzas) {
        for (String pizza : pizzas) {
            try {
                this.deliveryGal.push(pizza);
                System.out.println(pizza + " pizza added to deliveryGal stack.");

            } catch (Error e) {
                this.pizzaHouse.push(pizza);
                System.out.println("deliveryGal left to make deliveries! " + pizza + " pizza added to pizzaHouse stack.");
            }
        }
        System.out.println("\nDELIVERIES ARE UNDERWAY...\n");
    }

    public void deliver() {
        int numPizzas = this.deliveryGal.size;
        for (int i = 0; i < numPizzas; i++) {
            String pizzaType = this.deliveryGal.pop();
            System.out.println(pizzaType + " pizza delivered!");
        }
    }

    public static void main(String[]args) {
        String [] pizzas = {"pepperoni","cheese","veggie","meat","hawaiian", "margherita"};
        PizzaDelivery pizzaDelivery = new PizzaDelivery();
        pizzaDelivery.assign(pizzas);
        pizzaDelivery.deliver();
    }
}
