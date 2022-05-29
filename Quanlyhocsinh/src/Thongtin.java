import java.util.Date;

public class Thongtin extends Hocsinh {
    private String lop;
    private String khoahoc;
    private String kyhoc;

    public Thongtin() {
    }



    public Thongtin(String name, Date ngaysinh, String quequan, String lop, String khoahoc, String kyhoc) {
        super(name, ngaysinh, quequan);
        this.lop = lop;
        this.khoahoc = khoahoc;
        this.kyhoc = kyhoc;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }

    public String getKyhoc() {
        return kyhoc;
    }

    public void setKyhoc(String kyhoc) {
        this.kyhoc = kyhoc;
    }

    @Override
    public String toString() {
        return "Thongtin :"+ super.toString() +
                "lop :" + lop + '\'' +
                ", khoahoc :" + khoahoc + '\'' +
                ", kyhoc :" + kyhoc + '\'' ;
    }
}
