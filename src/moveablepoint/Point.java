package moveablepoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y){

    }
    public Point(){
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

    public void setXY(float x, float y){

    }
    public String getXY(){
        float [] array = {x,y};
        return "{" + array[0] + "," + array[1] + "}";
    }

    public String tostring(){
        return "(" +x +"," +y+")";
    }

}
