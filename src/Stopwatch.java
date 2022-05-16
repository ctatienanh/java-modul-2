public class Stopwatch {
    public static void main(String[] args) {
        watch wt = new watch();
     int[] array = new int[100000];
     for (int i=0; i<array.length; i++){
         array[i] =  (int) (Math.random()*10000);
     }
     wt.Startime();
     for (int i=0;i< array.length-1; i++){
         for (int j=i+1; j < array.length;j++){
             if (array[j]<array[i]){
                 int a = array[i];
                 array[i] = array[j];
                 array[j] = a;
             }
         }
     }
    wt.Endtime();
        System.out.println(wt.getElapsedTime());

    }
}
