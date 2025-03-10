

public class MainProgram {

    public static void main(String[] args) {
        //you can test the program here
        Organism organism = new Organism(20, 30);
        System.out.println(organism);
        organism.move(-10,5);
        System.out.println(organism);
        System.out.println("---");
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 62));
        herd.addToHerd(new Organism(14, 6));
        herd.addToHerd(new Organism(27, 63));
        herd.addToHerd(new Organism(53, 12));
        herd.addToHerd(new Organism(87, 22));
        System.out.println(herd);
        herd.move(5,10);
        System.out.println("----");
        System.out.println(herd);
    }
}
