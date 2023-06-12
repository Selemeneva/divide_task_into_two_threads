import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class QueueWithStacks<T> {
    private Stack<T> stack1; // Стек для добавления элементов
    private Stack<T> stack2; // Стек для удаления элементов

    public QueueWithStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(T element) {
        stack1.push(element);
        HashMap<String, Integer> myHashMap = new HashMap<>();
        Iterator<Map.Entry<String, Integer>> myIterator = myHashMap.entrySet().iterator();
    }

    public T dequeue() {
        if (stack2.isEmpty()) {
            // Перекладываем элементы из stack1 в stack2 в обратном порядке
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }
}
