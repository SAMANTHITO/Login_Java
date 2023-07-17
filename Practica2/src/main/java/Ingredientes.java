

public class Ingredientes {
    public String descripcion;
    public float costo;
    
    public Ingredientes(String descrip,float cos){
        //super(precio);
        this.descripcion=descrip;
        this.costo=cos;
    }
    public void setDescripcion(String des){
        this.descripcion=des;
    }
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setCosto(float cos){
        this.costo=cos;
    }
    public float getCosto(){
        return costo;
    }
   
    
}
