import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack{
    private Node top;

    public Stack(){
        this.top = null;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + "pushed into the stack");
    }

    public void pop(){
        if(top == null){
            System.out.println("Stack Underflow!");
            return;
        }
        System.out.println(top.data + "popped from the stack");
        top = top.next;
    }

    public void display(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Stack1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}