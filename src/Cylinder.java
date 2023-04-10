public class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius, String color, double v) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return this.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder[radius=" + this.getRadius() + ",color=" + this.getColor() + ",height=" + this.height + "]";
    }
}
