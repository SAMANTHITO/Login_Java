
import java.util.Scanner;


public class MainClass {

    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        int ingreso=0;
        try {            
            System.out.println("INGRESE LA CANTIDAD DE INGREDIENTES: ");
            ingreso=sn.nextInt();
            Ingredientes []ingrediente  = new Ingredientes[ingreso];
            //double precio=0;
            float cost;
            String desc;
            double precio=0.00;
            sn.nextLine();
            
            for(int i=0;i<ingrediente.length;i++){
            System.out.println("INGRESE DESCRIPCION DEL INGREDIENTE " +(i+1)+ ": ");
            desc=sn.nextLine();
            //ingrediente[i].setDescripcion(desc);
            //desc = sn.next();
            System.out.println("INGRESE PRECIO DEL INGREDIENTE"+ (i+1) +": ");
            cost= sn.nextFloat();
            sn.nextLine();
            //ingrediente[i].setCosto(cost);
            //cost= sn.nextFloat();
            ingrediente[i] = new Ingredientes(desc,cost);
            }
            System.out.println("****INFORMACION DE LA PIZZA****");
            System.out.println(" INGREDIENTES       PRECIO");
            for(int i=0;i<ingrediente.length;i++) {
                
                
                System.out.println(" "+ingrediente[i].getDescripcion()+"             "+" "+ingrediente[i].getCosto());               
                precio += ingrediente[i].getCosto();
                
            }
            System.out.println("______________________________________");
            System.out.println("precio de la pizza es : "+ precio); 
        } catch (Exception e) {
            System.out.println("error " +e);
        }
        
    }
    
}
