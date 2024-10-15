public class LL2 {
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

    public void addFirst(int data) {
        Node newNode = new Node(data);
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
    public static void main(String args[]) {
        LL2 ll = new LL2();
        
        ll.addFirst(24);
        ll.addFirst(12);
        ll.addFirst(42);
        ll.addFirst(32);
        ll.add(1,9);
        
        ll.print();
        
}
}
