import java.util.ArrayList;

class ListManager<T> {
    //list to store elements of generic type T
    private final ArrayList<T> list;

    public ListManager() {
        this.list = new ArrayList<>();
    }

    public void addItem(T item) {
        list.add(item);
    }

        //removes item from the list if it exists
    public void removeItem(T item) {
        list.remove(item);
    }

        //updates an item at a given index if in bound
    public void updateItem(int index, T newValue) {
        if (index >= 0 && index < list.size()) {
            list.set(index, newValue);
        } else {
            System.out.println("Index out of bounds");
        }
    }

        //displays the list with a title
    public void displayList(String title) {
        System.out.println("\n" + title + ":");
        for (T item : list) {
            System.out.println(item);
        }
    }
}

public class Asn5 {
    public static void main(String[] args) {
        //listManager for Strings
        ListManager<String> fruitManager = new ListManager<>();
        fruitManager.addItem("Apple");
        fruitManager.addItem("Banana");
        fruitManager.addItem("Mango");
        fruitManager.addItem("Coconut");
        
        //listManager for Integers
        ListManager<Integer> numberManager = new ListManager<>();
        numberManager.addItem(15);
        numberManager.addItem(22);
        numberManager.addItem(35);
        numberManager.addItem(56);
        
        //display lists
        fruitManager.displayList("Fruits list");
        numberManager.displayList("Numbers list");
        
        //change lists
        fruitManager.updateItem(1,"Grape");
        numberManager.removeItem(22);
        
        //display lists after modifications
        fruitManager.displayList("Fruits list after removal");
        numberManager.displayList("Numbers list after update");
    }
}
