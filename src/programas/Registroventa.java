
package programas;
import java.util.Scanner;
public class Registroventa {
    public static void main(String[] args){
        //declarar variables
        String vendedor;
        Double vt1,vt2,vt3,comision,sm,sn;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Nombre de Vendedor:");
        vendedor = lectura.next();
        //entrada de datos
        System.out.print ("Sueldo Mensual:");
        sm=lectura.nextDouble();
        System.out.print ("Venta1:");
        vt1=lectura.nextDouble();
        System.out.print ("Venta2:");
        vt2=lectura.nextDouble();
        System.out.print ("Venta3:");
        vt3=lectura.nextDouble();
        //proceso de datos
       comision=(vt1+vt2+vt3)*0.10;
       sn=sm+comision;
       //Salida de datos
        System.out.println("El sueldo mensual:"+sm);
        System.out.println("La comision de venta:"+comision);
        System.out.println("Sueldo Neto:"+sn);
        //falta mostrar resultados
    }
}
