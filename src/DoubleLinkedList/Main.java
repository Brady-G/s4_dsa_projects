package DoubleLinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertDLL(5, 0);
        dll.insertDLL(10, 100);
        dll.insertDLL(15, 100);

        dll.traverseDLL();
        dll.reverseTraverseDLL();

        dll.deleteFromDLL(2);

        dll.traverseDLL();

        dll.searchNode(10);

        dll.deleteDLL();

        dll.traverseDLL();
    }
}
