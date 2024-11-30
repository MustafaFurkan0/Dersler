package DS10_Queue_LinkedList;

public class main {

    public static void main(String[] args) {

        Queue queue = new Queue(5);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);

        queue.deQueue();
        
        queue.print();
        
        System.out.println("\nKuyruktaki eleman sayısı: " + queue.counter);
        System.out.println("Kuyruğun başındaki eleman: " + queue.front.data);
        System.out.println("Kuyruğun sonundaki eleman: " + queue.rear.data);

    }

}
