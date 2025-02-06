import java.util.Scanner;

class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow! Cannot push " + value);
            return;
        }
        stack[++top] = value;
        System.out.println(value + " pushed into the stack");
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! No elements to pop");
            return;
        }
        System.out.println(stack[top] + " popped from the stack");
        top--;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

// ✅ Move the main class **outside** of Stack
public class StackUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        Stack stack = new Stack(size);

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
                    System.out.println("Exiting program..");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
