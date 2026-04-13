public class circularLL {

    private node head;// pointer to the head of the linked list
    private node tail;// pointer to the tail of the linked list
    public circularLL(){// constructor to initialize the head and tail pointers of the linked list
        this.head = null;// initializing the head pointer to null since the linked list is initially empty
        this.tail = null;// initializing the tail pointer to null since the linked list is initially empty
    }
    public void insert(int value){// method to insert a new node at the end of the linked list
        node node = new node(value);// creating a new node with the given value
        if(head == null){// if the linked list is empty, set the head and tail pointers to the new node
            head = node;
            tail = node;
            return;//   return from the method since the new node is now the only node in the linked list
        }
        tail.next = node;// set the next pointer of the current tail to the new node
        tail = node;// update the tail pointer to the new node
        tail.next = head;// set the next pointer of the new tail to the head to maintain the circular structure of the linked list

        System.out.println("HEAD    "+head.value);// print the value of the head node for debugging purposes
    }


    //delete elements
    public void delete(int val){// method to delete a node with the given value from the linked list
        Node node = head;// pointer to traverse the linked list starting from the head
        if(node == null){// if the linked list is empty, return from the method since there are no nodes to delete
            return;
        }
        if(node.value == val){// if the value of the head node matches the given value, update the head pointer to the next node and set the next pointer of the tail to the new head
            head = head.next;// update the head pointer to the next node in the linked list
            tail.next = head;// set the next pointer of the tail to the new head to maintain the circular structure of the linked list
            return;
        }
        do{
            Node next = node.next;// pointer to the next node in the linked list
            if(next.value == val){// if the value of the next node matches the given value, update the next pointer of the current node to skip the next node and set the next pointer of the tail to the head if the deleted node is the tail
                node.next = next.next; // update the next pointer of the current node to skip the next node, effectively deleting it from the linked list
                if(next == tail){       // if the deleted node is the tail, update the tail pointer to the current node and set the next pointer of the new tail to the head to maintain the circular structure of the linked list
                    tail = node;// update the tail pointer to the current node
                }
                return;
            }
            node = node.next;// move to the next node in the linked list
        }while(node != head);// continue traversing the linked list until we have looped back to the head, indicating that we have checked all nodes for the given value

    }
    private class node{// inner class to represent a node in the linked list
        int value;// value of the node
        node next;// pointer to the next node in the linked list

        public node(int value) {// constructor to initialize the value of the node
            this.value = value;// initializing the value of the node with the given value       
            this.next = null;// initializing the next pointer to null
        }
    }
}
