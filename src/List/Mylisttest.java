package List;

public class Mylisttest {
    public static void main(String[] args) {
        MyList<Integer>LisInteger = new MyList<Integer>();
        LisInteger.add(2);
        LisInteger.add(3);
        System.out.println(LisInteger.get(0));
        System.out.println(LisInteger.get(1));

    }

}
