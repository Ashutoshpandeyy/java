public class Mian {
    public static class Node{
        int data;
        Node next;
 
    void display(){
        while(ptr != null){
            System.out.println(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }
    }
    public static class Linkedlist{
        Node head;
        Node tail;
        int size;
        void addLast(int val){
            Node node = new Node();
            node.data = val;
            if(this.size == 0){
                this.head = node;
                this.tail = node;
            }else{
                this.tail.next = node;
                this.tail = node;
            }
            this.size ++;            
        }
        int size(){
            return this.size;
        }
         
        void display(){
            Node ptr = this.head;
            while(ptr != null){
                System.out.println(ptr.data + " ");
                ptr = ptr.next;
            }
            System.out.println();
        }
        void removeFirst(){
            if(this.size==0){
                System.out.println("Lise is empty");

            }else if(this.size==1){
                this.head=this.tail=null;
                this.size = 0;
            }else{
                Node nbr = this.head.next;
                this.head.next = null;
                this.head = nbr;
                this.size--;
            }

        }
    }
   
    
   
    public static void main(String[] args) {
        Linkedlist l1 =  new Linkedlist();
        l1.addLast(10);
        l1.addLast(20);
        l1.addLast(30);
        l1.addLast(40);
        System.out.println(l1.size());
        l1.display();

    }
}
