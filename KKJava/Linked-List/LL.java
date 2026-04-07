public class main {

    private node head; // pointer to the first node in the linked list
    private node tail;// pointer to the last node in the linked list
    private int size;// size of the linked list

    public LL(){
        this.size = 0;//initializing the size of the linked list to 0
    }

    public void insertFirst(int val) {// method to insert a new node at the beginning of the linked list
        Node node = new Node(val);// creating a new node with the given value
        node.next = head;// pointing the next of the new node to the current head of the linked list
        head = node;// pointing the head of the linked list to the new node
        if (tail == null) {// if the tail is null, it means that the linked list is empty, so we need to
                           // point the tail to the new node as well
            tail = head;// pointing the tail of the linked list to the new node
        }
        size++;// incrementing the size of the linked list by 1
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {// method to display the elements of the linked list
        node temp = head;// creating a temporary node to traverse the linked list starting from the head
        while (temp != null) {// traversing the linked list until we reach the end (when temp becomes null)
            System.out.print(temp.value);// printing the value of the current node
            temp = temp.next;// moving to the next node in the linked list
        }
        System.out.println("END");
    }

    private class node {
        private int value;
        private node next;

        public node(int value) {
            this.value = value;
        }

    }

}
