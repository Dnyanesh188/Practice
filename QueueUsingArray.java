import java.util.Scanner;

class Queue{
    private int[] queue;
    private int front,rear,capacity;

    public Queue(int size){
        queue = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }

    public void enqueue(int value){
        if(rear == capacity - 1){
            System.out.println("Queue overflow!");
            return;
        }
        queue[++rear] = value;
        System.out.println(value + "enqueued in queue");
    }

    public void dequeue(){
        if(front > rear){
            System.out.println("Queue underflow");
            return;
        }
        System.out.println(queue[front] + "dequeued from the queue");
        front++;
    }

    public void display(){
        if(front > rear){
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for(int i = front; i <= rear; i++){
            System.out.println(queue[i] + " ");
        }
        System.out.println();
    }
}

public class QueueUsingArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        int size = sc.nextInt();
        Queue queue = new Queue(size);

        while(true){
            System.out.println("\nQueue Operations");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = sc.nextInt();
                    queue.enqueue(value);
                    break;
                
                case 2:
                    queue.dequeue();
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}