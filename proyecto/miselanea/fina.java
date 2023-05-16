
/**
 * Write a description of class fina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class fina
{
     public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        esfero lapicero = new esfero();
        
        System.out.println("Bienvenido a la miselanea donde miguel, siga las instruciones : ");            
       
            System.out.println("Digite numero de  identificacion del usuario : ");            
            lapicero.identificacion = sc.next();
            System.out.println("Digite el nombre del usuario: ");
            lapicero.nombre = sc.next();
            System.out.println("Digite el telefono del usuario: ");
            lapicero.telefono = sc.next();
            System.out.println("Digite la cantidad de los esferos tipo roller: ");
            lapicero.tipoRoller = sc.nextDouble();
            System.out.println("Digite la cantidad de los esferos tipo pluma : ");
            lapicero.tipoPluma = sc.nextDouble();
            System.out.println("Digite la cantidad  de los esferos tipo boligrafo : ");
            lapicero.tipoBolígrafos = sc.nextDouble();
            
            lapicero.totRoller = (lapicero.tipoRoller * 2300);
            lapicero.totPluma= (lapicero.tipoPluma * 1800);
            lapicero.totBolígrafos = (lapicero.tipoBolígrafos  * 5000 );
            lapicero.TotalVenta = (lapicero.totRoller + lapicero.totPluma + lapicero.totBolígrafos);
   
    System.out.println("Total de compra de los esferos tipo roller es: " + lapicero.totRoller);
    System.out.println("Total de compra de los esferos tipo pluma es: " + lapicero.totPluma);
    System.out.println("Total de compra de los esferos tipo boligrafo es: " + lapicero.totBolígrafos);
    System.out.println("El promedio total del las compras en esferos es de : " + lapicero.TotalVenta); 
}
}
