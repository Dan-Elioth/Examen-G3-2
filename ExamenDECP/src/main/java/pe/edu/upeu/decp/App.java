package pe.edu.upeu.decp;

import java.util.Scanner;

import pe.edu.upeu.decp.examen.ResolucionExamen;
import pe.edu.upeu.decp.utils.LeerTeclado;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner tec=new Scanner(System.in);

        ResolucionExamen obj=new ResolucionExamen();

        //LeerTeclado tec=new LeerTeclado();
        
        //int modulo=tec.leer(1, "----------→Introduzca un numero del 1 al 5, ojo no hay el numero 3←---------- " );
        int dato;
        System.out.println("----------→ Introduzca un numero del 2 al 5 ←---------- ");
        dato=tec.nextInt();

        while (dato<=5) {
            switch (dato ) {
                case 2: obj.Ejercicio2();break;
                case 3: obj.Ejercicio3();break;
                case 4: obj.Ejercicio4();break;
                case 5: obj.Ejercicio5();break;
                default:System.out.println("Manito no  seas paltas elije bien :)");break;
    
            }
            System.out.println("     ----------→          Si desea salir, coloque 0             ←---------- ");
            System.out.println("----------→Si desea seguir probando los algoritmos coloque: ←---------- ");
            System.out.println("              \n 2=Ejercio2\n 3=Ejercicio3\n 4=Ejercicio4\n 5=Ejercicio5");
            dato=tec.nextInt();
            if (dato==0) {
                System.exit(0);       
            }
        }
 

    
    }
}
