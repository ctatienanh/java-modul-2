import java.util.Scanner;

public class checkmax2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] array = new int[3][4];
        int max =  array [0][0];
        for (int i=0; i< array.length; i++){
            for (int j=0; j<array[0].length;j++ ){
                System.out.println("nhap phan tu hang " + i +" cot " + j);
                array[i][j] = sc.nextInt();
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println("phan tu max trong mang :" +max);
    }
}
