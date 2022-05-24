package Qlks;

import java.util.Date;

public class Khach {
    private String Hoten;
    private Date ngaysinh;
    private int cmt;

    public Khach() {
    }

    public Khach(String hoten, Date ngaysinh, int cmt) {
        Hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.cmt = cmt;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getCmt() {
        return cmt;
    }

    public void setCmt(int cmt) {
        this.cmt = cmt;
    }

    public void add(Khach khach) {
    }

    @Override
    public String toString() {
        return "Khach{" +
                "Hoten='" + Hoten + '\'' +
                ", ngaysinh=" + ngaysinh +
                ", cmt=" + cmt +
                '}';
    }
}
