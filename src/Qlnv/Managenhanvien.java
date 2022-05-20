package Qlnv;

import java.util.Scanner;

public class Managenhanvien {
    Nhanvien nv [] = new Nhanvien[0];
    Scanner sc ;

    public Managenhanvien() {
        this.sc = new Scanner(System.in);
    }

    public void menu(){
        System.out.println("====Menu====");
        System.out.println("1:Them Nhan Vien");
        System.out.println("2:Sua Nhan Vien");
        System.out.println("3:Xoa Nhan Vien");
        System.out.println("4:Tinh luong nhan vien");
        System.out.println("5: Hien thi nhan vien");


    }

    public Nhanvien createnhanvien(boolean isfulltime){
        System.out.println("Nhap id nhan vien :");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten nhan vien :");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi nhan vien :");
        int age = Integer.parseInt(sc.nextLine());
        int number;
        if (isfulltime){
            System.out.println("Nhap he so nhan vien :");
            number = Integer.parseInt(sc.nextLine());
            return new Fulltime(id,name,age,number);
        }
        else {
            System.out.println("Nhap so ngay lam viec :");
            number = Integer.parseInt(sc.nextLine());
            return new Parttime(id,name,age,number);
        }
    }
    public void add(Nhanvien nhanvien){
        Nhanvien newnv [] = new Nhanvien[nv.length+1];
        for(int i=0; i< nv.length; i++){
            newnv[i] = nv[i];
        }
        newnv[newnv.length-1] = nhanvien;


    }




}
