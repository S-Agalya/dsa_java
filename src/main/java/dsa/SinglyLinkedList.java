package dsa;

class SinglyLinkedlist{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;
//adding elements
    public void addNode(int data){
       Node newNode= new Node(data);
       if(head == null){
        head=newNode;
        tail=newNode;
       } else{
        tail.next=newNode;
        tail=newNode;
       }
    }
//display elements
    
    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("Nothing to display as list is empty");
            return;
        }
            System.out.println("Singly list elements");
        while(current != null){
            System.out.print(current.data);
            current=current.next;
        }
        System.out.println();
    }


//insertAtBeginning
    public void insertAtBeginning(int data){
        Node newNode= new Node(data);
       if(head == null){
        head=newNode;
        tail=newNode;
       } else{
        newNode.next=head;
        head=newNode;
       }
    }
//insertAtEnd
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
//deleteAtBeginning
    public void deleteAtBeginning(){
        if(head == null){
            System.out.println("Nothing is to delete as list is empty");
            return;
        }
        head=head.next;
        if(head == null){
            tail=null;
        }
    }
//deleteAtEnd
    public void deleteAtEnd(){
        if(head == null){
            System.out.println("list is empty nothing to delete");
            return;
        }
        if(head == tail){
             head=null;
             tail=null;
             return;
        }
       Node current=head;
        while(current.next != tail){
            current=current.next;
        }
        current.next=null;
        tail=current;
    }
//Searchelement
    public void Searchelement(int data){
        Node current=head;
        int position=1;  // starting position
        while(current != null){
            if(current.data == data){
               System.out.println("element " + data  + "found at position " + position);
               return;
            }current=current.next;position++;
        }
        System.out.println("Number not found");
    }
    public static void main(String[] args){
        SinglyLinkedlist sList=new SinglyLinkedlist();
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.addNode(5);
        sList.display();

        sList.insertAtBeginning(0);
        sList.display();

        sList.insertAtEnd(7);
        sList.display();
        
        sList.deleteAtBeginning();
        sList.display();

        sList.deleteAtEnd();
        sList.display();
        
        sList.Searchelement(6);
        sList.display();
    }

}