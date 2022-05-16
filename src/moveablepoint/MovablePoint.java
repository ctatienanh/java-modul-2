package moveablepoint;

public class MovablePoint extends Point {
    private float xSpeed =0.0f;
    private float ySpeed = 0.0f;
    public void MovablePoint(float x, float y , float xSpeed, float ySpeed){
    }
    public MovablePoint(){
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed=ySpeed;
    }
    public String getSpeed(){
        float array [] = { xSpeed , ySpeed};
        return  +array[0] + "," +array[1];
    }

    @Override
    public String tostring() {
        return super.tostring() + "spped = (" + xSpeed+ "," +ySpeed+ ")";
    }

    MovablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }


}
