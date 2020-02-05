package shapes;
//command + n will allow inteliJ to create a constructor
public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;


    abstract protected double setLength(double length);

    abstract protected double setWidth(double width);



    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width; }

        public double getLength(){
        return length;
    }



        public double setlength(){

            return width;
    }
    }


