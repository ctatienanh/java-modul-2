package Stack;

import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack = new LinkedList<>();

    public MyGenericStack() {}

    public LinkedList<T> getStack() {
        return stack;
    }

    public void setStack(LinkedList<T> stack) {
        this.stack = stack;
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }
        return false;
    }


}