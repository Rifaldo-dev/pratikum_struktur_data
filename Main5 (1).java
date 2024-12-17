import java.util.LinkedList;

public class Main5 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        System.out.println("Linked List:");
        for (int value : linkedList) {
            System.out.println("Elemen: " + value);
        }
    }
}
