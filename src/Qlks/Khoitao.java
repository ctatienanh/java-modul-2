package Qlks;

import java.util.ArrayList;

import java.sql.Date;
import java.util.Scanner;

public class Khoitao<E> {
    ArrayList<Khach> khachs = new ArrayList<>();
    ArrayList<Khachsan>phong = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void Menu(){
        System.out.println("===Menu===");
        System.out.println("1: Tao Phong");
        System.out.println("2: Tao khach hanh moi");
        System.out.println("3: Hien thi cac phong ");
        System.out.println("4: Hien thi khach hang");
        System.out.println("5: Tim kiem khach hang");
        switch (Integer.parseInt(sc.nextLine())){
            case 1:
                addphong(khoitaophong());
                break;
            case 2:
                addkhach(khoitaokhach());
                break;
            case 3:
                phong.sort(new SortByPrice());
                showkhachsan();
                break;
            case 4:
                khachs.sort(new Sortdate());
                showkhach();
                break;
            case 5:
                System.out.println("nhap ten khach hang can tim");
                String name = sc.nextLine();
                check(name);
                break;
        }

    }

    public Khachsan khoitaophong(){
        System.out.println("Nhap loai phong:");
        String phong = sc.nextLine();
        System.out.println("Nhap gia phong:");
        double giaphong = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap so phong:");
        String diachi = sc.nextLine();
        return new Khachsan(phong,giaphong,diachi);
    }

    public void addphong(Khachsan ks){

        phong.add(ks);
    }


    public Khach khoitaokhach(){
        System.out.println("Nhap ten :");
        String name = sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        int ngay = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap thanh sinh:");
        int thang = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap nam sinh");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so chung minh thu :");
        int cmt = Integer.parseInt(sc.nextLine());
        return new Khach(name, new Date(nam -1900, thang-1, ngay ), cmt);
    }

    public void  addkhach(Khach khach){
        khachs.add(khach);
    }

    public void showkhachsan (){
        for (Khachsan x: phong) {
            System.out.println(x);
        }
    }

    public void showkhach(){
        for (Khach x: khachs){
            System.out.println(x);
        }
    }
    public void check(String name){
        ArrayList<Khach> newkhach = new ArrayList<>();
        for (int i = 0; i < khachs.size(); i++) {
            if (khachs.get(i).getHoten().equals(name)){
                newkhach.add(khachs.get(i));
            }
        }
        for (Khach x: newkhach) {
            System.out.println(x);
        }
    }


}
