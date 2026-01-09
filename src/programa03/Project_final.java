/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa03;
import java.util.Scanner;
/**
 *
 * @author DIEGO
 */
public class Project_final {
    
    public static void main(String args[]){
       String cliente;
       double ct,cp,c1,c2,c3;
       //creando objeto de lectura
       Scanner lectura=new Scanner(System.in);
       //entrada de datos
       System.out.print("Nombre de cliente: ");
       cliente=lectura.next();
       System.out.print("Compra 1: ");
       c1=lectura.nextDouble();
       System.out.print("Compra 2: ");
       c2=lectura.nextDouble();
       System.out.print("Compra 3: ");
       c3=lectura.nextDouble();
       //proceso de datos
       ct=c1+c2+c3;
       cp=ct/3;
       //salida de datos
       System.out.println(" ");
       System.out.println("Compra total: "+ct);
       System.out.println("Compra promedio: "+cp);
    }//fin del metodo  
}//fin del programa
