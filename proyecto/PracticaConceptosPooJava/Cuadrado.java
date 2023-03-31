public class Cuadrado extends Figura {
    
    private double lado;

    public Cuadrado(String color, double lado){
        super(color);
        this.lado = lado;
    }

    public double calularArea(){
        return lado * lado;
    }
}
