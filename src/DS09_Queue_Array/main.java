package DS09_Queue_Array;

public class main {

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(60);

        queue.deQueue();
        
        queue.enQueue(60);
        
        queue.nbrElement();
        
        queue.print();

    }

}
