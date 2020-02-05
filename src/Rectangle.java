import java.lang.Math;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getArea(){
        return "The area of the rectangle is " + this.width * this.length;
    }

    public String getDiagonal(){
        return "The diagonal of the rectangle is " + Math.sqrt((this.width * this.width) + (this.length*this.length));
    }

    public String isSquare(){
        if(this.width == this.length){
            return "This is a square";
        }else{
            return "This is not a square";
        }
    }

}
