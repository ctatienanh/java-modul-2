package Qlks;

public class Khachsan  {
    private String loaiphong;
    private double giaphong;
    private String diachi;

    public Khachsan(){
    }

    public Khachsan(String loaiphong, double giaphong, String diachi) {
        this.loaiphong = loaiphong;
        this.giaphong = giaphong;
        this.diachi = diachi;
    }

    public String getLoaiphong() {
        return loaiphong;
    }

    public void setLoaiphong(String loaiphong) {
        this.loaiphong = loaiphong;
    }

    public double getGiaphong() {
        return giaphong;
    }

    public void setGiaphong(double giaphong) {
        this.giaphong = giaphong;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

//    @Override
//    public int compareTo(Khachsan o) {
//        if (this.getGiaphong() > o.giaphong){
//            return 1;
//        }
//        else {
//            return -1;
//        }
//    }

    @Override
    public String toString() {
        return "Khachsan{" +
                "loaiphong='" + loaiphong + '\'' +
                ", giaphong=" + giaphong +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
