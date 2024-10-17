public class LL8 {
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
            public void reverse(){
                Node prev  = null;
                Node curr = tail = head;
                Node next;

                while(curr != null){
                    next = curr.next;
                    curr.next = prev;
                    prev = curr;
                     curr = next;

                }
                head = prev;
            }
    public static void main(String args[]) {
        LL8 ll = new LL8();
        
        ll.addFirst(24);
        ll.addFirst(12);
        ll.addFirst(42);
        ll.addFirst(32);
        ll.add(1,9);
        
        ll.print();
        ll.reverse();
        ll.print();
        
}
}