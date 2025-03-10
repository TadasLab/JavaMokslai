

public class Main {

    public static void main(String[] args) {
        // You can test your program her
        MisplacingBox coffeBox = new MisplacingBox();
        coffeBox.add(new Item("Saludo", 5));
        coffeBox.add(new Item("Pirkka", 5));
        coffeBox.add(new Item("Kopi Luwak", 5));
        System.out.println(coffeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeBox.isInBox(new Item("Kopi Luwak")));

    }
}
