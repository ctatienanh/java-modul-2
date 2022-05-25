package LinkedListt;

public class Sanpham {

    private int id;
    private String tensanpham;
    private double giasp;

    public Sanpham() {
    }

    public Sanpham(String tensanpham, double giasp,int id) {
        this.tensanpham = tensanpham;
        this.giasp = giasp;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public double getGiasp() {
        return giasp;
    }

    public void setGiasp(double giasp) {
        this.giasp = giasp;
    }


}
