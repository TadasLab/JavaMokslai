import java.util.ArrayList;
import java.util.List;

public class Box implements Packable{
    private double maxWeight;
    private int itemCount;
    private List<Packable> items;
    public Box(double maxWeight){
    this.maxWeight=maxWeight;
    this.items= new ArrayList<>();
    }
    public void add(Packable item) {
        if (this.weight() + item.weight() <= maxWeight) {
            items.add(item);
            itemCount++;
        }
    }
    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable item : items) {
                totalWeight += item.weight();
            }
            return totalWeight;
        }
    @Override
    public String toString(){
        return "Box: " + itemCount + " items, total weight " + weight() + " kg";
    }
}
