public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        changeHistory.add(initialBalance);
    }
    public void printAnalysis(){
        double largest = changeHistory.maxValue();
        double smallest = changeHistory.minValue();
        double average = changeHistory.average();
        System.out.println("Product: " + getName());
        System.out.println("History: " + changeHistory.toString());
        System.out.println("Largest amount of product: " +largest );
        System.out.println("Smallest amount of product: " +smallest  );
        System.out.println("Average: " +average );
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(getBalance());
    }
    @Override
    public double takeFromWarehouse(double amount) {
        double previousBalance = getBalance();
        double takenAmount = super.takeFromWarehouse(amount);
        changeHistory.add(getBalance());
        return takenAmount;
    }

    public String history() {
        return changeHistory.toString();
    }
}
