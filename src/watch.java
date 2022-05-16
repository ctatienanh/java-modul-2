public class watch {
    private long startime;
    private long endtime;

    public void  Startime() {
        this.startime = System.currentTimeMillis();
    }

    public void Endtime(){
        this.endtime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        long time =  this.endtime - this.endtime;
        return time;
    }


}
