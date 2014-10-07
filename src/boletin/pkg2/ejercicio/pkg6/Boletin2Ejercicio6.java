
package boletin.pkg2.ejercicio.pkg6;

import java.util.Scanner;


public class Boletin2Ejercicio6 {

   
    public static void main(String[] args) {
        float precio,pagado,total;
        
        System.out.println("Precio Original:");
        Scanner dato=new Scanner(System.in);
        precio=dato.nextFloat();
        System.out.println("Pagado:");
        pagado=dato.nextFloat();
        total=((precio-pagado)/precio)*100;
        System.out.println("Descuento= "+total+" %");
    }
    
}
