public class CD  implements Packable{
    private String author;
    private String name;
    private int pubYear;
    private double weight;
    public CD(String author, String name, int pubYear){
        this.author=author;
        this.name=name;
        this.pubYear=pubYear;
        this.weight=0.1;
    }
    @Override
    public double weight() {
        return weight;
    }
    @Override
    public String toString(){
        return author + ": " + name + " (" + pubYear + ")";
    }
}
