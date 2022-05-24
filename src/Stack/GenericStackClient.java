package Stack;

public class GenericStackClient {

    public static void stackofString(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        System.out.println(stack.size());
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());
    }

    public  static void stackofIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.size());
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());

    }

    public static void main(String[] args) {
        stackofString();
        System.out.println("//////");
        stackofIntegers();
    }
}
