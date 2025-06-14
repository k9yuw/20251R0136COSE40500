package datastructure;

public class StackWithArray {
    private int[] arr;
    private int top;
    private int capacity;

    public StackWithArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1)
            throw new IllegalStateException("스택이 가득 찼습니다.");
        arr[++top] = x;
    }

    public int pop() {
        if (top == -1)
            throw new IllegalStateException("스택이 비어 있습니다.");
        return arr[top--];
    }

    public int peek() {
        if (top == -1)
            throw new IllegalStateException("스택이 비어 있습니다.");
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}