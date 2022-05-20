package List;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList <E>{
    private int size =0;
    private static final int DeFAULT_CAPACITY =10;
    private Object elements [];
    public MyList(){
        elements = new Object[DeFAULT_CAPACITY];
    }

    public void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e){
        if (size==elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int i){
        return (E) elements[i];
    }


}
