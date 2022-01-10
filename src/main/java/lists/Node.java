package lists;

import java.util.ArrayList;
import java.util.Date;

public class Node {
    public Object data;
    public Node next;
    ArrayList<Node> nodeArrayList =new ArrayList<>();

     Node(Object data, Node next){
        this.data=data;
        this.next=next;
        this.nodeArrayList.add(next);
    }
    Node(Object data){
         this.data=data;
         this.next=null;
    }
    int length(Node head){
if(head ==null) return 0 ;
if(head.next !=null){
    head=head.next;
    head.next= head;
}
        return nodeArrayList.size();
    }

    public static void main(String[] args) {
         Long x = new Date().getTime();
         if(x !=null)

         System.out.println(x);
        Node n=new Node("one");
        Node n1=new Node("two",n );
        Node n2=new Node("three",n );
        Node n3=new Node("four",n );
        n.next=n1;
        n1.next=n2;
        n2.next=n3;

//        System.out.println(n3.length());
    }
}
