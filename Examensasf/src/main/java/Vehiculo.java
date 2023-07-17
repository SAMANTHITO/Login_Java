/**
 *
 * @author Alfonso Vera
 */
public class Vehiculo {
    protected String color;
    protected String placa;
    protected String marca;
    protected String modelo;
    
    public Vehiculo(){
    }
    public Vehiculo(String color, String placa, String marca, String modelo){
        this.color = color;
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void imprime(){
        System.out.println("carapteristicas del vehiculo"+color+" "+placa+" "+marca+" "+ modelo);
    }
}
