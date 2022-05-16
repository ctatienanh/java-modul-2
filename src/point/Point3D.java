package point;

public class Point3D extends Point2D {
    public float z = 0.0f;

    public Point3D( float x, float y , float z) {
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
    }

    public String getXYZ(){
        float[] array = {getX(),getY(),z};
        return "{" +getX()+ "," +getY() + "," +z+"}";
    }
    public String tostring(){
        return "(" +getX()+","+getY()+","+z+")";
    }
}
