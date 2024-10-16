public class LL5 {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void print() {
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
        }

        public void add(int idx, int data) {
            if(idx == 0) {
                addFirst(data);
                return;
            }
            Node newnode = new Node(data);
            size++;
            Node temp = head;
            int i = 0;

            while(i < idx - 1 ) {
               temp = temp.next;
               i++;
                }
                //i = idx -1 ; temp -> prev
                newnode.next = temp.next;
                temp.next = newnode;
            
            } 

         public int removeLast(){
            if(size == 0){
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            } else if (size ==  1){
                int val = head.data;
                head = tail = null;
                size =0;
                return val;
            }
           //prev ; i = size -2;
           Node prev = head;
           for(int i=0;i<size-2;i++) {
               prev = prev.next;
           }
           int val = prev.next.data;
           prev.next = null;
           tail = prev;
           size--;
           return val;

         }
    public static void main(String args[]) {
        LL5 ll = new LL5();
        
        ll.addFirst(24);
        ll.addFirst(12);
        ll.addFirst(42);
        ll.addFirst(32);
        ll.add(1,9);
        
        ll.print();
        ll.removeLast();
        ll.print();
        
}
}