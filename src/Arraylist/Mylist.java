package Arraylist;

public class Mylist<E> {
int size =0;
static final int DEFAULT_CAPACITY =10;
Object elements [] = new Object[size];

    public Mylist() {
    }
    public Object add (int index, E element ){
        Object arr[] = new Object[elements.length+1];
        for (int i = 0; i < size; i++) {
            arr[i] = elements[i];
        }
        arr[size] = element;
        elements = arr;
        return arr;
    }
    public Object remove (int index){
        Object newelemen []= new Object[size];
        for (int i = 0; i < size; i++) {
             if (i<index){
                 newelemen[i]= elements[i];
             }
             if (index>i){
                 newelemen[i]= elements[i];
             }
        }
        return newelemen;
    }


}

