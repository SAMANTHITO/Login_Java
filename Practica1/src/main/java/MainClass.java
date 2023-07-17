
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion, numPrueba; 
 
        while (!salir) {
 
            System.out.println("1. Verificar numero perfecto");
            System.out.println("2. Imprimir tabla de multiplicar");
            System.out.println("3. Verificar Factorial");
            System.out.println("4. Numero Invertido");
            System.out.println("5. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        verificarNumeroPerfecto();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        imprimirTablaMultiplicar();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        System.out.println("INGRESE UN NUMERO ENTERO");
                        numPrueba = sn.nextInt();
                        System.out.println("EL RESULTADO ES: "+ verificarFactorial(numPrueba));
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        invertirNumero();
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }   
    }

    private static void verificarNumeroPerfecto() {
        int i, suma =0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO: ");
        n = sc.nextInt();
        
        for(i=1;i<n;i++){
            if(n % i == 0){
                suma = suma + i;
            }
        }
        if(suma == n){
            System.out.println("PERFECTO");
        }else{
            System.out.println("NO ES PERFECTO");
        }
    }

    private static void imprimirTablaMultiplicar() {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO ENTERO: ");
        n = sc.nextInt();
        
        for(i=1;i<10;i++){
            System.out.println(n + " * " + i +" = " + n * i);
        }
    }

    private static int verificarFactorial(int prue) {
        int resul=1;
        for(int i=1;i<=prue;i++){
            resul *= i;
        }
        return resul;
    }

    private static void invertirNumero() {
      int numero, invertido = 0, resto;
 
      Scanner s = new Scanner( System.in );
      System.out.println( "Introduce un número: " );
      //validarNumeros(numero);
      numero = s.nextInt();
 
      while( numero > 0 ) {
         resto = numero % 10;
         invertido = invertido * 10 + resto;
         numero /= 10;
      }
      System.out.println( "Número invertido: " + invertido );
    }
    
    public static boolean validarNumeros(String datos){
       if (datos.matches("[0-9]*")) {
           return true;
       } else {
           return false;
       }
    }
    
}
