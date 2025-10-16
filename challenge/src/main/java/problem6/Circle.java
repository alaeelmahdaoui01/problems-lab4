package problem6;

public class Circle extends Forme{
    public Circle(double radius){
        super(radius);
    }
    public double getSurface(){
        return Math.round(Math.PI * this.getProperty() * this.getProperty()  * 100.0) / 100.0;
    }
    @Override
    public String toString(){
        return "Circle (radius " + this.getProperty() + " cm)";
    }
}
