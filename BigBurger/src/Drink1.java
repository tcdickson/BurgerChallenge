public class Drink1 extends MealOrder1{
    private int quantity;
    private boolean coke;
    private boolean pepsi;
    private boolean small;
    private boolean medium;
    private boolean large;
    private double cost;

    private double totalCost;


    public Drink1(double quantity, boolean coke, boolean pepsi, boolean small, boolean medium, boolean large) {
        this.quantity = (int) quantity;
        this.coke = coke;
        this.pepsi = pepsi;
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.cost = cost;
        this.totalCost = totalCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if (small && coke) {
            System.out.println("You have ordered " + quantity + " small coke(s)! ");
        } else if (small && pepsi) {
            System.out.println("You have ordered " + quantity + " small pepsi(s)! ");
        } else if (medium && coke) {
            System.out.println("You have ordered " + quantity + " medium coke(s)! ");
        } else if (medium && pepsi) {
            System.out.println("You have ordered " + quantity + " medium pepsi(s)! ");
        } else if (large && coke) {
            System.out.println("You have ordered " + quantity + " large coke(s)! ");
        } else if (large && pepsi) {
            System.out.println("You have ordered " + quantity + " large pepsi(s)! ");
        } else {
            System.out.println("Must select a drink and size from the menu! ");
        }
    }

    @Override
    public void printTotal() {
        super.printTotal();
        System.out.println(" " + totalCost);
    }

    public void calculateDrinkCost () {

        if (small && coke) {
            cost = 1;
            totalCost = cost * quantity;
//            System.out.println("You have ordered " + quantity + " small coke(s)! ");
        } else if (small && pepsi) {
            cost = 1;
            totalCost = cost * quantity;
        } else if (medium && coke) {
            cost = 2;
            totalCost = cost * quantity;
        } else if (medium && pepsi) {
            cost = 1;
            totalCost = cost * quantity;
        } else if (large && coke) {
            cost = 2;
            totalCost = cost * quantity;
        } else if (large && pepsi) {
            cost = 1;
            totalCost = cost * quantity;
        } else {
            System.out.println("Must select a drink and size from the menu! ");
            }
        }
    }

