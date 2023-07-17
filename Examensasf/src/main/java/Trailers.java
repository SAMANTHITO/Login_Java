/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfonso Vera
 */
public class Trailers extends Vehiculo{
    protected String descripcion;
    public Trailers(){
    }
    public Trailers(String descripcion){
        super();
        
    }
    public void imprimirTrailer(){
        System.out.println("descripcion: "+descripcion);
    }
}
