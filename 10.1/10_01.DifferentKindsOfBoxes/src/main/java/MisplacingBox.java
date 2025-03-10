import java.util.ArrayList;

public class MisplacingBox extends Box{
        private Item item;
        public MisplacingBox(){
            this.item=null;
        }
        public void add(ArrayList<Item> items) {
            if (items.isEmpty()) {
                items.add(item);
            }
        }
        public void add(Item item) {
            if (this.item == null) {  // Only add if the box is empty
                this.item = item;
            }
        }
        public boolean isInBox(Item item){
            return false;
        }
    }

