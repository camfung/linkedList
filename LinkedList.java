public class LinkedList {
    static node head;
    public static class node {
        node next;
        int data;

        public node(int d) {
            next = null;
            data = d;
        }
    }
    public LinkedList insert(LinkedList list, int data){
        node newNode = new node(data);
        node curr = head;
        if (head.next == null){
            head.next = newNode;
        }
        else {
            while (curr.next != null){
                curr = curr.next;
            }
        }
        curr.next = newNode;
        return list;
    }

    public void print(){
        System.out.print("[");
        node n = head;
        while (n.next != null){
            System.out.print(n.data + ", ");
            n = n.next;
        }
        System.out.print(n.data + "]");
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.head = new node(0);
        for (int i =1 ; i < 10; i++){
            list = list.insert(list, i);
        }
        list.print();
    }
}