
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfonso Vera
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int opcion;
        String marc="";
        boolean salir = false;
        Cliente clien ;
        
        Trailers trail;
        ArrayList<Cliente> ventas;
        ventas=new ArrayList();
        
        while (!salir) {
 
            System.out.println("1. Registrar la venta de vehículo");
            System.out.println("2. Buscar los clientes que han adquirido más de un vehículo al año");
            System.out.println("3. Buscar los clientes que han comprado una marca en especial");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("ventas");
                        registrarVenta();
                        break;
                    case 2:
                        System.out.println("buscar por año");
                        buscarVehiculo();
                        break;
                    case 3:
                        System.out.println("buscar por marca");
                        System.out.println("INGRESE UN MARCA DEL VAHICULO");
                        marc = sn.nextLine();
                        buscarMarca(marc);
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

    private static void registrarVenta() {
        ArrayList<Cliente> ventas = new ArrayList();
        Scanner sn = new Scanner(System.in);
        String tve;
        Cliente client = new Cliente();
        System.out.println("INGRESE TIPO DE VEHICULO");
        tve=sn.nextLine();
        if("buseta".equals(tve)){
            Buseta buset = new Buseta();
            System.out.println("INGRESE COLOR");
            buset.setColor(sn.nextLine());
            System.out.println("INGRESE MARCA");
            buset.setMarca(sn.nextLine());
            System.out.println("INGRESE PLACA");
            buset.setPlaca(sn.nextLine());
            System.out.println("INGRESE MODELO");
            buset.setModelo(sn.nextLine());
            
            System.out.println("INGRESE NOMBRE ");
            client.setNombre(sn.nextLine());
            System.out.println("INGRESE APELLIDO");
            client.setApellido(sn.nextLine());
            System.out.println("INGRESE EDAD");
            client.setEdad(sn.nextLine());
            System.out.println("INGRESE TIPO DE VEHICULO A COMPRAR ");
            client.setTipo_vehiculo(sn.nextLine());
            System.out.println("INGRESE FECHA DE COMPRA ");
            client.setFecha_compra(sn.nextLine());
            
        }else if("trailler".equals(tve)){
            Trailers trailer=new Trailers();
            System.out.println("INGRESE COLOR");
            trailer.setColor(sn.nextLine());
            System.out.println("INGRESE MARCA");
            trailer.setMarca(sn.nextLine());
            System.out.println("INGRESE PLACA");
            trailer.setPlaca(sn.nextLine());
            System.out.println("INGRESE MODELO");
            trailer.setModelo(sn.nextLine());
            
            System.out.println("INGRESE NOMBRE ");
            client.setNombre(sn.nextLine());
            System.out.println("INGRESE APELLIDO");
            client.setApellido(sn.nextLine());
            System.out.println("INGRESE EDAD");
            client.setEdad(sn.nextLine());
            System.out.println("INGRESE TIPO DE VEHICULO A COMPRAR ");
            client.setTipo_vehiculo(sn.nextLine());
            System.out.println("INGRESE FECHA DE COMPRA ");
            client.setFecha_compra(sn.nextLine());
            
            ventas.add(client);
        }else
            System.out.println("ingrese un tipo de vehiculo disponible");
        
    }

    private static void buscarVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void buscarMarca(String marc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
