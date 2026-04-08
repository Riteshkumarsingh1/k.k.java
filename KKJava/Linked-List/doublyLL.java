public class doublyLL {
    private class node{
        int value;// value of the node
        node next;// pointer to the next node in the linked list
        node prev;// pointer to the previous node in the linked list


        public Node(int value , Node next, Node prev){
                this.value = value;// initializing the value of the node with the given value
                this.next = next;// initializing the next pointer of the node with the given next pointer
                this.prev = prev;// initializing the previous pointer of the node with the given previous pointer     
    }
    public class LL{

    Node head;
    private void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
        head.prev = node;
        }
        head = node;
    }
    // public void display(){
    //     Node node  = head;
    //     while(node!=null){
    //         System.out.print(node.value+"->");
    //         node = node.next;
    //     }
    //     System.out.println("END");
    // }

    public void display(){
        Node node  = head;
        Node last = null;
        while(node!=null){
            System.out.print(node.value+"->");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        System.out.println("Print in Reverse");
        while (last!= null){
            System.out.print(last.value+"->");
            last = last.prev;
        }
        System.out.println("START");
    }

//  
    private class Node{
        int value;// value of the node
        Node next;// pointer to the next node in the linked list
        public Node(int value){
            this.value = value;// initializing the value of the node with the given value
        }
    }
    }
    
}
