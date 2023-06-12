import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    @FunctionalInterface
    interface StringModificator {
        public String getString(String text);
    }
    class Box<T> {
        T whatInBox;

        public Box(T whatInBox) {
            this.whatInBox = whatInBox;
        }


    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        List<String> list = new ArrayList<>();
        Object


        // Поиск элемента по индексу
        int index = 2;
        System.out.println(linkedList.get(1));
        if (index >= 0 && index < linkedList.size()) {
            String element = linkedList.get(index);
            System.out.println("Элемент по индексу " + index + ": " + element);
        } else {
            System.out.println("Индекс выходит за пределы списка");
        }
    }

}


