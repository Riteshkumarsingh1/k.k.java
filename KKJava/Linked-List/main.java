// public class main {
//     public static void main(String[] args) {

//         LL list = new LL();
//         list.insertFirst(3);
//         list.insertFirst(2);
//         list.insertFirst(1);
//         list.insert(100, 4);
//         System.out.println(list.deleteFirst());
//         System.out.println(list.deleteLast());
//         System.out.println(list.delete(2));
//         System.out.println(list.find(100));
//         list.display();
//     }
// }

//doubly linked list

// public class main {
//     public static void main(String[] args) {
//         doublyLL list = new doublyLL();
//         list.insertFirst(3);
//         list.insertFirst(2);
//         list.insertFirst(1);
//         list.insertFirst(4);
//         System.out.println(list.deleteFirst());
//         System.out.println(list.deleteLast());
//         System.out.println(list.delete(2));
//         System.out.println(list.find(100));
//         list.display();
//         list.insertLast(5);
//         list.insertLast(6);
//         list.insert(4, 7);
//     }
// }

//circular linked list
public class main {
    public static void main(String[] args) {
        circularLL list = new circularLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();
        list.delete(1);
        list.display();
    }
}