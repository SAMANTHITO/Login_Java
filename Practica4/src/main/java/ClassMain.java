
import java.util.Scanner;

/**
 *
 * @author Alfonso Vera
 */
public class ClassMain {

        
    public static void main(String[] args) {
        int anio;
        Scanner sc = new Scanner(System.in);
        Excepcionbisiesto excep = new Excepcionbisiesto();
        System.out.println("Aplicación para determinar si el año es bisiesto");
        System.out.println("Ingrese año a evaluar: ");
        anio = sc.nextInt();
        
        try {
            excep.validarBisiesto(anio);
        } catch (MisExcepciones e) {
            System.out.println("error debido a : " + e.getMessage());
        }
    }
    
}
