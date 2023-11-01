import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    
    System.out.println(Solution.linkedListValues(a));
    // -> [ "a", "b", "c", "d" ]
  }

   public static List<String> linkedListValues(Node<String> head) {
    // todo
    Node<String> pointer = head; 
    List<String> linkedList = new ArrayList<>(); 

    while(pointer.next!=null){
      linkedList.add(pointer.val);
      pointer = pointer.next; 

      if(pointer.next==null){
        linkedList.add(pointer.val); 
        break; 
      }
    }
    return linkedList;
  }
}
