/**
 *
 * @author Alfonso Vera
 */
public class Excepcionbisiesto {
    
    public Excepcionbisiesto(){}
    
    public void validarBisiesto(int anyo) throws MisExcepciones{
        
        if((anyo % 4 ==0) && (anyo % 100 != 0 || anyo % 400 == 0)) {
            System.out.println(anyo + " es un año bisiesto");
        }else {
            throw new MisExcepciones(" no es un año bisiesto");
            
        }
    }
}
