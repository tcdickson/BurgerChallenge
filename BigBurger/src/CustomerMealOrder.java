public class CustomerMealOrder extends MealOrder1{

    private Burger1 burger1;
    private Drink1 drink1;
    private Side1 side1;

    public CustomerMealOrder(Burger1 burger1, Drink1 drink1, Side1 side1) {
        this.burger1 = burger1;
        this.drink1 = drink1;
        this.side1 = side1;
    }
}
