package dsa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedlistTest {

    @Test
    void testAddNode() {
        SinglyLinkedlist sList = new SinglyLinkedlist();
        sList.addNode(1);
        sList.addNode(2);
        assertEquals("Singly list elements: 1 -> 2 -> null", sList.display());
    }

    @Test
    void testInsertAtBeginning() {
        SinglyLinkedlist sList = new SinglyLinkedlist();
        sList.addNode(2);
        sList.insertAtBeginning(1);
        assertEquals("Singly list elements: 1 -> 2 -> null", sList.display());
    }

    @Test
    void testInsertAtEnd() {
        SinglyLinkedlist sList = new SinglyLinkedlist();
        sList.addNode(1);
        sList.insertAtEnd(2);
        assertEquals("Singly list elements: 1 -> 2 -> null", sList.display());
    }

    @Test
    void testDeleteAtBeginning() {
        SinglyLinkedlist sList = new SinglyLinkedlist();
        sList.addNode(1);
        sList.addNode(2);
        sList.deleteAtBeginning();
        assertEquals("Singly list elements: 2 -> null", sList.display());
    }

    @Test
    void testDeleteAtEnd() {
        SinglyLinkedlist sList = new SinglyLinkedlist();
        sList.addNode(1);
        sList.addNode(2);
        sList.deleteAtEnd();
        assertEquals("Singly list elements: 1 -> null", sList.display());
    }

    @Test
    void testSearchelement() {
        SinglyLinkedlist sList = new SinglyLinkedlist();
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        assertEquals(2, sList.Searchelement(2));  // Element found at position 2
        assertEquals(-1, sList.Searchelement(5));  // Element not found
    }
}
