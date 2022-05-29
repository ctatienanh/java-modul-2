package LinkedListQlsp;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.util.LinkedList;
import java.util.Scanner;

public class Qlsp {
    Scanner sc = new Scanner(System.in);
    LinkedList<Sanpham> sp = new LinkedList<>();

    public void menu(){
        System.out.println("===Menu===");
        System.out.println("1: Them san pham");
        System.out.println("2: sua san pham");
        System.out.println("3: xoa san pham");
        System.out.println("4: hien thi san pham");
        System.out.println("5: tim kiem san pham");
        System.out.println("6: sap xep san pham");
        switch (Integer.parseInt(sc.nextLine())){
            case 1:
                addsanpham(sanphamcreat());
                break;
            case 2:
                System.out.println("nhap id can sua");
                int id = Integer.parseInt(sc.nextLine());
                if (getindex(id) != -1) {
                    edit(getindex(id), sanphamcreat());
                }else {
                    System.out.println("khong tim thay id ");
                }
                break;
            case 3:
                System.out.println("nhap id can sua");
                int ide = Integer.parseInt(sc.nextLine());
                if (getindex(ide) != -1) {
                    dellet(getindex(ide));
                }
                else System.out.println("khong tim thay id ");
            case 4:
                show();
                break;
            case 5:
                System.out.println("nhap name can check ");
                String name = sc.nextLine();
                check(name);
                break;
            case 6:
                sapxep();
                break;
        }
    }
   public Sanpham sanphamcreat(){
       System.out.println("nhap ten san pham :");
       String name = sc.nextLine();
       System.out.println("nhap gia san pham :");
       Double giasanpham = Double.parseDouble(sc.nextLine());
       System.out.println("nhap id san pham :");
       int id = Integer.parseInt(sc.nextLine());

       return new Sanpham(name,giasanpham,id);
   }
   public void addsanpham(Sanpham s ){
        sp.add(s);
   }


   public int getindex(int id){
        int index = -1;
       for (int i = 0; i < sp.size(); i++) {
           if (sp.get(i).getId() == id){
               index = i;
               return index;
           }
       }
       return index;
   }
   public void edit(int index, Sanpham s){
        sp.set(index,s);
   }

   public void dellet(int index){
        sp.remove(index);
   }
   public void check(String name){
        LinkedList<Sanpham> newsp = new LinkedList<>();
       for (int i = 0; i < sp.size(); i++) {
           if (sp.get(i).getTensanpham().equals(name)){
               newsp.add(sp.get(i));
           }
       }
       for (Sanpham x: newsp) {
           System.out.println(x);
       }
   }
   public void sapxep(){
        sp.sort( new Sortprice());
   }


   public void show(){
       for (Sanpham x: sp) {
           System.out.println(x);
       }
   }


}
