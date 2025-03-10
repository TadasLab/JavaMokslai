
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        Box box = new Box(10);
        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        System.out.println(box);
        System.out.println(book1);
        System.out.println(cd1);
    }

}
