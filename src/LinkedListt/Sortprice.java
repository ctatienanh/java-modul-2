package LinkedListt;

import java.util.Comparator;

public class Sortprice implements Comparator<Sanpham> {
    @Override
    public int compare(Sanpham o1, Sanpham o2) {
        if (o1.getGiasp() > o2.getGiasp()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
