public class Organism implements Movable{
   private int xAxis;
   private int yAxis;
    public Organism(int x, int y){
        this.xAxis=x;
        this.yAxis=y;
    }
    public void move(int dx, int dy){
        this.xAxis=this.xAxis + dx;
        this.yAxis=this.yAxis +dy;
    }
    @Override
    public String toString(){
        return "x: " + xAxis + "; y: " + yAxis;
    }
}
