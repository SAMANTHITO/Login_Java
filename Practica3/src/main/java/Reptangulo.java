/**
 *
 * @author Alfonso Vera
 */
public class Reptangulo extends Geometria implements FiguraGeometrica{
    private double base;
    private double altura;

    public Reptangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() 
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        super.calcularArea();
        area = base*altura;
    }

    @Override
    public void calcularPerimetro() {
        super.calcularPerimetro();
        perimetro = 2 * (base+altura);
    }
    
    
    
    
    @Override
    public String mover(int x, int y){
    return "nuevo centro del rectangulo es:( " + x + ", " + y + ")";
    }
}
