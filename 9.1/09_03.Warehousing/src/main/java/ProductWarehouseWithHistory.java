public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity ){
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
    }
    public void printAnalysis(){
        double largest = changeHistory.maxValue();
        double smallest = changeHistory.minValue();
        double average = changeHistory.average();
        System.out.println("Largest amount of product: " +largest );
        System.out.println("Smallest amount of product: " +smallest  );
        System.out.println("Average: " +average );
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(amount);
    }
    @Override
    public double takeFromWarehouse(double amount) {
        double takenAmount = super.takeFromWarehouse(amount);
        changeHistory.add(getBalance());
        return takenAmount;
    }

    public String History() {
        return changeHistory.toString();
    }
}
