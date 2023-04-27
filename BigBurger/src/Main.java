public class Main {
    public static void main(String[] args) {

        Burger1 tysBurger = new Burger1(2,false,false,true);
        tysBurger.calculateBurgerCost();

        Drink1 tysDrink = new Drink1(2, true, false, false, true, false);
        tysDrink.calculateDrinkCost();

        Side1 tysSide = new Side1(2, false,true, false);
        tysSide.calculateSideCost();

        double costOfMeal = tysBurger.getTotalCost() + tysDrink.getTotalCost() + tysSide.getTotalCost();
        System.out.println("The total cost of your meal is " + costOfMeal);

        itemizedList(tysBurger, tysDrink, tysSide);


    }
    public static void burgerCost (Burger1 customerBurgerCost) {
        customerBurgerCost.calculateBurgerCost();
    }

    public static void  drinkCost (Drink1 customerDrinkCost) {
        customerDrinkCost.calculateDrinkCost();

    }
    public static void  sideCost (Drink1 customerSideCost) {
        customerSideCost.calculateDrinkCost();
    }
    public static void itemizedList (Burger1 burger1, Drink1 drink1, Side1 side1) {
        burger1.printItemizedList();
        drink1.printItemizedList();
        side1.printItemizedList();
    }
}