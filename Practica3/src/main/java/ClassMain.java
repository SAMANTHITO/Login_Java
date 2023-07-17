
import java.util.Scanner;


public class ClassMain {

    public static void main(String[] args) {
        
        
        Scanner sn = new Scanner(System.in);
        Circulo circulo = new Circulo(5);
        circulo.calcularArea();
        System.out.println("el area del circulo es : "+circulo.getArea());
        circulo.calcularPerimetro();
        System.out.println("el perimetro del circulo es : "+circulo.getPerimetro());
        System.out.println(" "+circulo.mover(4, 4));
        
        
        Reptangulo reptangulo = new Reptangulo(4, 5);
        reptangulo.calcularArea();
        System.out.println("\n el area del rectangulo es : "+reptangulo.getArea());
        reptangulo.calcularPerimetro();
        System.out.println("el area del rectangulo es : "+reptangulo.getPerimetro());
        System.out.println(" "+reptangulo.mover(-4, 5));
    }
    
}
