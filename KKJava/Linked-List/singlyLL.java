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

    // method to insert a new node at the end of the linked list
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

    // method to insert a new node at a specific index in the linked list
    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;

    }

    // method to delete the first node of the linked list and return its value
    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }
    // method to delete the last node of the linked list and return its value

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    // method to delete a node at a specific index in the linked list and return its
    // value
    public int delete(int index) {
        if (index = 0) {
            return deleteFirst();
        }
        if (index = size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;

    }

    // method to get the node at a specific index in the linked list
    public Node get(int index) {// method to get the node at a specific index in the linked list
        Node node = head;// creating a node to traverse the linked list starting from the head
        for (int i = 0; i < index; i++) { // traversing the linked list until we reach the desired index
            node = node.next;// moving to the next node in the linked list
        }
        return node;// returning the node at the desired index

    }

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

    public void display() {// method to display the elements of the linked list
        node temp = head;// creating a temporary node to traverse the linked list starting from the head
        while (temp != null) {// traversing the linked list until we reach the end (when temp becomes null)
            System.out.print(temp.value);// printing the value of the current node
            temp = temp.next;// moving to the next node in the linked list
        }
        System.out.println("END");
    }

    // inner class to represent a node in the linked list
    private class node {// class to represent a node in the linked list
        private int value;// value of the node
        private node next;// pointer to the next node in the linked list

        public node(int value) {// constructor to initialize the value of the node
            this.value = value;// initializing the value of the node with the given value
        }

        public node(int value, node next) {// constructor to initialize the value and next pointer of the node
            this.value = value;// initializing the value of the node with the given value
            this.next = next;// initializing the next pointer of the node with the given next pointer
        }

    }

}
