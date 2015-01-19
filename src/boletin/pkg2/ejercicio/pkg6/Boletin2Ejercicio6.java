
package boletin.pkg2.ejercicio.pkg6;

import java.util.Scanner;


public class Boletin2Ejercicio6 {

   
    public static void main(String[] args) {
        float precio,pagado,total;
        
        System.out.println("Prezo Orixinal:");
        Scanner dato=new Scanner(System.in);
        precio=dato.nextFloat();
        System.out.println("Pagado:");
        pagado=dato.nextFloat();
        total=((precio-pagado)/precio)*100;
        System.out.println("Desconto= "+total+" %");
    }
    
}
