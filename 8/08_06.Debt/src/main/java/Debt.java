public class Debt {
    private double balance;
    private double intrestRate;
    public Debt(double initialBalance, double initialIntrestRate){
        this.balance = initialBalance;
        this.intrestRate = initialIntrestRate;
    }
    public void printBalance(){
        System.out.println(balance);
    }
    public void waitOneYear(){
        balance = balance * intrestRate;
    }
}
