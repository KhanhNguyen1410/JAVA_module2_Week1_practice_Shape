package shape;

public class Geometric {
    private String color;
    private boolean filled;
    public Geometric(){
        this.color = "green";
        this.filled = true;
    }
    public Geometric(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with color of " + this.color + " and " + (isFilled() ? "filled" : "not filled");
    }
}
