package problem6;

public class Square extends Forme{
    public Square(double side){
        super(side);
    }
    public double getSurface(){
        return Math.round(this.getProperty() * this.getProperty()  * 100.0)/100.0;
    }
    @Override
    public String toString(){
        return "Square (side " + this.getProperty() + " cm)";
    }
}
