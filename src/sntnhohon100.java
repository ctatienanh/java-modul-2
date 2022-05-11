public class sntnhohon100 {
    public static void main(String[] args) {
        System.out.println("cac so nguyen to nho hon 100");
        int num = 2;
        boolean check = true;
        while (num < 100) {
            for (int i = 2; i < Math.sqrt(num); i++) {
                    if (num%i==0){
                        check = false;
                        break;
                    }
            }
            if (check){
                System.out.println(num);
            }
            else {
                check = true;
            }
            num++;
        }
    }
}
