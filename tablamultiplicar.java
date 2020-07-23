import java.util.Scanner;

public class tablamultiplicar {
    
    public static void main(String[] args) {

       Scanner prueba = new Scanner (System.in);
       
        System.out.println("introduce un número del 1 al 10");

       int numero2 = prueba.nextInt(); 
       
        for (int numero = 1; numero <= 10; numero++) 
        {

            
             int resultado = numero * numero2;
            
            
            System.out.println("Resultado: "+resultado);

        }
        prueba.close();

        
        
    }

}