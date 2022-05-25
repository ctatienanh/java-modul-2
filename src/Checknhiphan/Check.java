package Checknhiphan;

import java.util.Scanner;

public class Check {
    static int [] array = {1,2,3,4,5,6,7,8,9};
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("nhap so can tim ");
            int key = sc.nextInt();
            if (check(key, array) != -1) {
                System.out.println(check(key, array));
            } else {
                System.out.println("khong co phan tu trong mang");
            }
        }

    }


    static int check(int key , int []arr){
        int dau =0;
        int cuoi = arr.length-1;

        while (cuoi>=dau){
            int giua = (dau + cuoi)/2;
            if (arr[giua] == key){
                return giua;
            } else if (arr[giua] > key){
                cuoi = giua-1;
            }else {
                dau = giua+1;
            }
        }
        return -1;
    }

}
