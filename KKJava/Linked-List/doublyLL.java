public class doublyLL {
    private class node{
        int value;// value of the node
        node next;// pointer to the next node in the linked list
        node prev;// pointer to the previous node in the linked list


        public Node(int value , Node next, Node prev){// constructor to initialize the value, next pointer, and previous pointer of the node
                this.value = value;// initializing the value of the node with the given value
                this.next = next;// initializing the next pointer of the node with the given next pointer
                this.prev = prev;// initializing the previous pointer of the node with the given previous pointer     
    }
    public class LL{

    Node head;
    private void insertFirst(int val) {// method to insert a new node at the beginning of the linked list
        Node node = new Node(val);// creating a new node with the given value
        node.next = head;// setting the next pointer of the new node to the current head of the linked list
        node.prev = null;// setting the previous pointer of the new node to null since it will be the new head of the linked list
        if(head!=null){// if the linked list is not empty, set the previous pointer of the current head to the new node
        head.prev = node;// setting the previous pointer of the current head to the new node
        }
        head = node;// updating the head of the linked list to the new node
    }
    // public void display(){
    //     Node node  = head;
    //     while(node!=null){
    //         System.out.print(node.value+"->");
    //         node = node.next;
    //     }
    //     System.out.println("END");
    // }

    public void display(){// method to display the elements of the linked list
        Node node  = head;// pointer to traverse the linked list
        Node last = null;// pointer to keep track of the last node in the linked list
        while(node!=null){// traverse the linked list until the end is reached
            System.out.print(node.value+"->");
            last = node;// update the last pointer to the current node
            node = node.next;// move to the next node in the linked list
        }
        System.out.println("END");
        System.out.println("Print in Reverse");
        while (last!= null){// traverse the linked list in reverse order until the beginning is reached
            System.out.print(last.value+"->");
            last = last.prev;// move to the previous node in the linked list
        }
        System.out.println("START");
    }

    public void insertLast(int val) {// method to insert a new node at the end of the linked list
        if(head == null){// if the linked list is empty, call the insertFirst method to insert the new node at the beginning of the linked list
            insertFirst(val);
            return;
        }
        Node node = new Node(val);// creating a new node with the given value
        Node last = head;// pointer to traverse the linked list to find the last node
        while(last.next!=null){// traverse the linked list until the last node is reached
            last = last.next;// move to the next node in the linked list
        }
        last.next = node;// set the next pointer of the last node to the new node
        node.prev = last;// set the previous pointer of the new node to the last node
    }

    //insertion at middle of the linked list
    public Node find(int value) {// method to get the node at a specific index in the linked list
        Node node = head;// creating a node to traverse the linked list starting from the head
        while (node != null) { // traversing the linked list until we reach the end or find the desired value
            if (node.value == value) {// if the value of the current node matches the desired value
                return node;// returning the node
            }
            node = node.next;// moving to the next node in the linked list
        }
        return null;// returning null if the value is not found
    }
    public void insert(int after, int value) {// method to insert a new node with the given value after the node with the specified value
        Node p = find(after);// finding the node with the specified value
        if(p==null){// if the node with the specified value is not found, print a message and return
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);// creating a new node with the given value
        node.next = p.next;// setting the next pointer of the new node to the next pointer of the found node
        p.next = node;// setting the next pointer of the found node to the new node
        node.prev = p;// setting the previous pointer of the new node to the found node
        if(node.next!=null){// if the new node is not inserted at the end of the linked list, set the previous pointer of the next node to the new node
            node.next.prev = node;// setting the previous pointer of the next node to the new node
        }
    }
    private class Node{// inner class to represent a node in the linked list
        int value;// value of the node
        Node next;// pointer to the next node in the linked list
        public Node(int value){
            this.value = value;// initializing the value of the node with the given value
        }
    }
    }
    
}
