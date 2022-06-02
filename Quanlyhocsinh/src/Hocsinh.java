import java.text.SimpleDateFormat;
import java.util.Date;

public class Hocsinh {
    private String name;
    private Date ngaysinh;
    private String quequan;


    public Hocsinh() {
    }

    public Hocsinh(String name, Date ngaysinh, String quequan) {
        this.name = name;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    @Override
    public String toString() {
        SimpleDateFormat n = new SimpleDateFormat("dd/MM/yyyy");
        return "Hocsinh :" + name + '\'' +
                ", ngaysinh :" + n.format(ngaysinh) +
                ", quequan :'" + quequan + '\'';
    }
}
