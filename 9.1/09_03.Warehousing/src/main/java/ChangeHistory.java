import java.lang.reflect.Array;
import java.util.ArrayList;

public class ChangeHistory{
    private ArrayList<Double> history;
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    public ArrayList<Double> getHistory() {
        return history;
    }
    public void add(double status){
        history.add(status);
    }
    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }

        double min = history.get(0);
        for (double value : history) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }

        double max = history.get(0);
        for (double value : history) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public double average() {
        if (history.isEmpty()) {
           return 0;
        }

        double sum = 0;
        for (double value : history) {
            sum += value;
        }
        return sum / history.size();
    }
    public void clear(){
        history.clear();
    }
    @Override
    public String toString(){
        return history.toString();
    }
}
