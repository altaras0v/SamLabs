package Tasks.L7Task3;



public class MyStack {
    private int maxSize = 10;
    private int[] stackArray;
    private int top;

    public MyStack() {
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int element)throws StackException {
        if(isFull()){
            throw new StackException("Stack overflow");
        }
        else {
            top++;
            stackArray[top] = element;
        }
    }

    public int pop()throws StackException {
        if(isEmpty()){
            throw new StackException("Stack underflow");
        }
        return stackArray[top--];
    }

    public int readTop() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack underflow");
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int size() {
        return top + 1;
    }

    public void clear() throws StackException {
        while (!isEmpty()) {
            pop();
        }
    }


}
