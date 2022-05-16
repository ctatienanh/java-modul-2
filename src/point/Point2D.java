package point;

public class Point2D {
    private float x =0.0f;
    private float y=0.0f;
    public Point2D() {
    }
    public Point2D(float x , float y ) {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setxy(float x, float y){
    }
    public String getxy(){
        float[] array = new float[2];
        array[0] = x;
        array[1] = y;
        return "{" + array[0] + ", " + array[1] + "}";
    }
    public String tostring(){
        return "(" +x + "," +y+ ")";
    }

}
