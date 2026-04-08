public class 21Merge2SortedLL {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);// dummy node to simplify edge cases
        ListNode tail = dummy;// tail pointer to build the merged list
        while(list1!=null && list2!=null){// iterate until one of the lists is exhausted
            if(list1.val<list2.val){// compare the current nodes of both lists and append the smaller one to the merged list
                tail.next = list1;// append list1's current node to the merged list
                list1 = list1.next;// move to the next node in list1
            }else{
                tail.next = list2;// append list2's current node to the merged list
                list2 = list2.next;// move to the next node in list2
            }
            tail = tail.next;// move the tail pointer to the end of the merged list
        }
        if(list1!=null){// if there are remaining nodes in list1, append them to the merged list
            tail.next = list1;  // append the remaining nodes of list1 to the merged list
        }else{
            tail.next = list2;// if there are remaining nodes in list2, append them to the merged list
            list2 = list2.next;// append the remaining nodes of list2 to the merged list
        }
        tail = tail.next;// move the tail pointer to the end of the merged list
    }
    if(list1!=null){
        tail.next = list1;
    }else{
        tail.next = list2;
    }
    return dummy.next;
    
}
