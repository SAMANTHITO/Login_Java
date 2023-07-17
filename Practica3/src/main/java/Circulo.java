/**
 *
 * @author Alfonso Vera
 */
public class Circulo extends Geometria implements FiguraGeometrica{

    
    private double radio;
    static final double pi = 3.1415;

    public Circulo(double radio) 
    {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public void calcularArea() {
        super.calcularArea();
        area = pi*radio*radio;
    }

    @Override
    public void calcularPerimetro() {
        super.calcularPerimetro();
        perimetro=2 * pi * radio;
    }
    
    
    
    @Override
    public String mover(int x, int y){
    return "nuevo centro del circulo es:( " + x + ", " + y + ")";
    }
}
