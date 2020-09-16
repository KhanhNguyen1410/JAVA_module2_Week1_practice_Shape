package shape;

public class Square extends Rectangle {
    public Square(){

    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side,String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return  getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double side) {
        setWidth(side);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "has area = "+ getArea()+ "has side = " + getSide();
    }
}
