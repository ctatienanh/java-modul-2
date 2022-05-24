package Qlks;

import java.util.Comparator;

public class Sortdate implements Comparator<Khach> {
    @Override
    public int compare(Khach o1, Khach o2) {
        if(o1.getNgaysinh().before(o2.getNgaysinh())){
            return 1;
        }
        else return -1;
    }
}
