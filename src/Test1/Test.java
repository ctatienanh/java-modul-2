package Test1;

public class Test {

    public static void main(String[] args) {
        int arr[] = { 2,6,8,9,1,0};
        insertionSort(arr);
    }

    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
        for (int g: array ) {
            System.out.println(g);
        }
    }
}
