package Qlks;

import java.util.Comparator;

public class SortByPrice implements Comparator<Khachsan> {
    @Override
    public int compare(Khachsan o1, Khachsan o2) {
        if (o1.getGiaphong()> o2.getGiaphong()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
