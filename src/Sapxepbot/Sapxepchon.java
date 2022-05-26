package Sapxepbot;

public class Sapxepchon {
    public static void main(String[] args) {
        double array[] = {1.2,3.5,4.6,4.2,4.1};
        sapxepchon(array);
    }

    public static void sapxepchon(double arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            double a = arr[i];
            int j =i;
            for (int k = i+1; k < arr.length; k++) {
                if (a > arr[k]  ){
                    a = arr[k];
                    j = k;
                }
            }
            if (j != i){
                arr[j] = arr[i];
                arr[i] = a;
            }
        }
        for (double x:arr) {
            System.out.println(x);
        }
    }

}
