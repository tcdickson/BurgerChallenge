public class Burger1 extends  MealOrder1 {

    private boolean burgerSingle;

    private boolean burgerDouble;
    private boolean burgerTriple;
    private double cost;
    private int quantity;

    private double totalCost;

    public double getTotalCost() {
        return totalCost;
    }

    public Burger1(double quantity, boolean burgerSingle, boolean burgerDouble, boolean burgerTriple) {
        this.burgerSingle = burgerSingle;
        this.burgerDouble = burgerDouble;
        this.burgerTriple = burgerTriple;
        this.cost = cost;
        this.quantity = (int) quantity;
        this.totalCost = totalCost;
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if(burgerSingle) {
            System.out.println("You have ordered " + quantity + " triple cheese burger(s)! ");
        } else if (burgerDouble) {
            System.out.println("You have ordered " + quantity + " double cheese burger(s)! ");
        } else if (burgerTriple) {
            System.out.println("You have ordered " + quantity + " triple cheese burger(s)! ");
        } else {
            System.out.println("You did not order a burger! ");
        }
    }

    @Override
    public void printTotal() {
        super.printTotal();
        System.out.println(" " + totalCost);
    }


    public void calculateBurgerCost (){
        if(burgerSingle) {
            cost = 5;
            totalCost = cost * quantity;
        } else if (burgerDouble) {
            cost = 6;
            totalCost = cost * quantity;
        } else if (burgerTriple) {
            cost = 7;
            totalCost = cost * quantity;
        } else {
            System.out.println("Must select a burger from the menu! ");
        }




    }

}
