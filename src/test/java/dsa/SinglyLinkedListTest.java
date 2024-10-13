package dsa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();

        // Test addNode and display
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.addNode(5);
        System.out.println(sList.display());

        // Test insertAtBeginning
        sList.insertAtBeginning(0);
        System.out.println(sList.display());

        //  insertAtEnd
        sList.insertAtEnd(7);
        System.out.println(sList.display());

        //  deleteAtBeginning
        System.out.println(sList.deleteAtBeginning());
        System.out.println(sList.display());

        // deleteAtEnd
        System.out.println(sList.deleteAtEnd());
        System.out.println(sList.display());

        // searchElement
        System.out.println(sList.searchElement(6));  // Should print "Element not found"
        System.out.println(sList.searchElement(3));  // Should print "Element found at position x"
    }
}
