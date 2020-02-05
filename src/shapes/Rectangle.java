package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
//    protected double length;
//    protected double width;

    public Rectangle(double length, double width) {
        super(length, width);

    }

    @Override
    public double setLength(double length) {
        return length;
    }

    @Override
    public double setWidth(double width) {
        return width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;

    }
    @Override
    public double getArea(){
        return length * width;
    }
//
//        public double getArea() {
//        return this.length * this.width;
//    }
//
//    public double getPerimeter(){
//        return 2 * this.length + 2 * this.width;
//    }
}

//    protected double length;
//    protected  double width;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        return length * width;
//
//    }
//
//    public  double getPerimeter(){
//        return 2 * length + 2 * width;
//    }