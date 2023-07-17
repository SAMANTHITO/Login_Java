/**
 *
 * @author Alfonso Vera
 */
public class Buseta extends Vehiculo{
    protected String descripcion;
    public Buseta(){
    }
    public Buseta(String descripcion){
        super();
        
    }
    public void imprimirBuseta(){
        System.out.println("descripcion: "+descripcion);
    }
}
