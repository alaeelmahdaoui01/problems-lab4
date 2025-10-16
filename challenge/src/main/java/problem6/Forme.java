package problem6;

public abstract class Forme {
    private double property ;

    public Forme(double property){
        this.property = property ;
    }
    public double getProperty() {
        return property;
    }

    public void setProperty(double property) {
        this.property = property;
    }

    public abstract double getSurface();

    @Override
    public String toString(){
        return "Forme (property " + property + " cm)"  ;
    }

}
