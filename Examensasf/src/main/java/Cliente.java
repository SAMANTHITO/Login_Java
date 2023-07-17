/**
 *
 * @author Alfonso Vera
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String edad;
    private String tipo_vehiculo;
    private String fecha_compra;
    
    public Cliente(){}
    public Cliente(String nombre,String apellido,String edad,String tipo_vehiculo,String fecha_compra){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tipo_vehiculo = tipo_vehiculo;
        this.fecha_compra = fecha_compra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
    
}
