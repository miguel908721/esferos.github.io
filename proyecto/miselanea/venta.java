
/**
 * Write a description of class venta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class venta
{
     public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        String identificacion, nombre, telefono;
        double tipoRoller, tipoPluma, tipoBolígrafos,totRoller,totPluma,totBolígrafos,TotalVenta;
        double promedio = 0;
        
        System.out.println("Bienvenido a la miselanea donde miguel, siga los pasos : ");            
       
            System.out.println("Digite numero de  identificacion del cliente : ");            
            identificacion = sc.next();
            System.out.println("Digite el nombre del cliente: ");
            nombre = sc.next();
            System.out.println("Digite el telefono del cliente: ");
            telefono = sc.next();
            System.out.println("Digite la cantidad del tipo roller: ");
            tipoRoller = sc.nextDouble();
            System.out.println("Digite la cantidad del tipo pluma : ");
            tipoPluma = sc.nextDouble();
            System.out.println("Digite la cantidad  del tipo boligrafo : ");
            tipoBolígrafos = sc.nextDouble();
            
            totRoller = (tipoRoller * 230000);
            totPluma= (tipoPluma * 180000);
            totBolígrafos = (tipoBolígrafos * 250000 );
            TotalVenta = (totRoller + totPluma + totBolígrafos);
   
    System.out.println("Total de compra del tipo roller es: " + totRoller);
    System.out.println("Total de compra del tipo pluma es: " + totPluma);
    System.out.println("Total de compra del tipo boligrafo es: " + totBolígrafos);
    System.out.println("El promedio total del lascompras es  : " + TotalVenta);   
}
}
