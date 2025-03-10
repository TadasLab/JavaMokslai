import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int maxWeight;
    // private int currentWeight;
    private ArrayList<Item> items;
    public BoxWithMaxWeight(int capacity){
        this.maxWeight = capacity;
    //    this.currentWeight = 0;
        this.items = new ArrayList<>();
    }
    @Override
    public void add(Item item) {
        if (item.getWeight() + getCurrentWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }
    @Override
    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            this.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }


    public int getCurrentWeight() {
        int weight = 0;
        for (Item item : items) {
            weight += item.getWeight();
        }
        return weight;
    }

    public int getRemainingCapacity() {
        return maxWeight - getCurrentWeight();
    }

}

