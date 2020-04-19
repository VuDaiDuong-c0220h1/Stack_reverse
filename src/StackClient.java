public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        MyStack stack2 = new MyStack(5);
        stack2.push(stack.pop());
        stack2.push(stack.pop());
        stack2.push(stack.pop());
        stack2.push(stack.pop());
        stack2.push(stack.pop());
        System.out.println("1. Size of stack after push operations: " + stack.size());
        stack.display();
        System.out.println();
        System.out.println("2. Reverse stack: ");
        stack2.display();

    }
}
