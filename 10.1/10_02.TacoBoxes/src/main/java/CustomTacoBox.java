public class CustomTacoBox implements TacoBox{
    private int tacos;
    public CustomTacoBox(int tacos){
        this.tacos=tacos;;
    };
    public int tacosRemaining(){
        return tacos;
    }
    @Override
    public void eat() {
        if (this.tacos>=1) {
            this.tacos--;
        }
    }
}
