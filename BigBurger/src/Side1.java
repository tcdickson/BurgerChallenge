public class Side1 extends MealOrder1 {
    private int quantity;
    private boolean salad;
    private boolean coleSlaw;
    private boolean fries;
    private double cost;

    private double totalCost;

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if (salad) {
            System.out.println("You have ordered " + quantity + " salad(s)! ");
        } else if (coleSlaw) {
            System.out.println("You have ordered " + quantity + " cole slaw(s)! ");
        } else if (fries) {
            System.out.println("You have ordered " + quantity + " fries! ");
        } else {
            System.out.println("You did not order a side! ");
        }
    }

    @Override
    public void printTotal() {
        super.printTotal();
    }

    public Side1(double quantity, boolean salad, boolean coleSlaw, boolean fries) {
        this.quantity = (int) quantity;
        this.salad = salad;
        this.coleSlaw = coleSlaw;
        this.fries = fries;
        this.cost = cost;
        this.totalCost = totalCost;
    }

    public void calculateSideCost () {
        if (salad == true) {
            cost = 1;
            totalCost = cost * quantity;
        } else if (coleSlaw == true) {
            cost = 2;
            totalCost = cost * quantity;
        } else if (fries == true) {
            cost = 7;
            totalCost = cost * quantity;

        } else {
            System.out.println("Must select a side and size from the menu! ");
        }

    }
}
