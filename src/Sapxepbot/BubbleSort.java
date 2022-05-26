package Sapxepbot;

public class BubbleSort {


    public static void main(String[] args) {
        boolean check = true;
        int arr [] = {1,5,2,3,7,5,0};
        for (int k = 1; k < arr.length && check ; k++) {
            check = false;
            for (int i = 0; i < arr.length-k; i++) {
                if (arr[i] > arr[i+1]){
                    int team = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = team;
                    check = true;
                }
            }
        }
        for (int x:arr)
        {
            System.out.print(x+" ");
        }
    }

}
