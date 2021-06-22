package pe.edu.upeu.decp.examen;

import java.util.Scanner;

import pe.edu.upeu.decp.utils.LeerTeclado;

public class ResolucionExamen {

    LeerTeclado tec=new LeerTeclado();

    //static Scanner tec=new Scanner(System.in);

    public void Ejercicio2() {

        System.out.println("---------------->Ejercicio1<----------------");

        //variables
        int nCar=1;

        double precio, impuesto=0, impuesto1=0.12, impuesto2=0.08, impuesto3=0.05, total=0;
        double categoria=0, categoria1=0, categoria2=0, categoria3=0;
        //datos de entrada y proceso

        int Nve=tec.leer(0, "Cuantos automoviles posee:");

        while (Nve > 0) {

            precio=tec.leer(0, "Ingresa el precio del automovil "+Nve);

            categoria=tec.leer(0,"Ingresa la categoria del automovil, teniendo en cuenta que solo se tiene 3 categorias");

            if (categoria>0 && categoria <4) {
                if (categoria ==1) {
                    impuesto=precio*impuesto1;
                    categoria1=categoria1+impuesto;              
                }else{
                    if (categoria ==2) {
                        impuesto=precio*impuesto2;
                        categoria2=categoria2+impuesto;                       
                    }else{
                        impuesto=precio*impuesto3;
                        categoria3=categoria3+impuesto; 
                    }
                }
                total=total+impuesto;
                System.out.println("El impuesto a pagar por el automivil es de : $ "+impuesto);            
             
            }
            Nve--;
            
        }
        System.out.println("----------→El precio a pagar impuesto por categoria es:←----------");
        System.out.println("El total a pagar por la categoria 1 es de: $ "+categoria1);
        System.out.println("El total a pagar por la categoria 2 es de: $ "+categoria2);
        System.out.println("El total a pagar por la categoria 3 es de: $ "+categoria3);
        System.out.println("-----------------------------------------------------------");
        System.out.println("El impuesto total a pagar por todos los automoviles es de: $"+total);
        
    }

    public  void Ejercicio3() {

        System.out.println("---------------->Ejercicio2<----------------");

        //variables
        int m=0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("\n La tabla del numero "+i+" es el siguiente \n"); 

            for (m = 1; m <= 10; m++) {  

                System.out.println(i+" por "+m+" es igual a "+i*m);
                
            } 
            
        }
        
    }

    public  void Ejercicio4() {

        System.out.println("---------------->Ejercicio4<----------------");

        int rango=tec.leer(0,"Ingrese el rango (hasta donde quiere saber cuantos numeros perfectos hay) :");
        int i, j, suma, sec=0;
        int canti=tec.leer(0, "Ingrese cuantos numeros perfectos desea ver (dentro del rango): ");
        System.out.println("→→→→→→→→☻Los numero perfectos son:☻←←←←←←←→");
        for(i=1;i <= rango;i++){  

            suma=0;    
            for(j = 1;j < i;j++){                            
                 if(i % j==0){
                    suma = suma + j; 
                 }
            }
            if(i == suma){ 
              
                sec++;
                if (sec<=canti) {
                    System.out.println(i);
                }else{
                    break;
                }
            }
        }
    }
    
    public  void Ejercicio41() {

        System.out.println("---------------->Ejercicio4<----------------");

        int rango=tec.leer(0,"Ingrese el rango (hasta donde quiere saber cuantos numeros perfectos hay) :");
        int i=1, j=1, suma, sec=0;
        int canti=tec.leer(0, "Ingrese cuantos numeros perfectos desea ver (dentro del rango): ");
        System.out.println("→→→→→→→→☻Los numero perfectos son:☻←←←←←←←→");

        while(i<=rango){ 
            suma=0;    
            while(j < i){                           
                if(i % j==0){
                    suma = suma + j; 
                }
                j++;
            }
            if(i == suma){
                sec++;
                if (sec<=canti) {
                    System.out.println(i);
                }else{
                    break;
                }  
            }
            i++;  
        }
    }   

    public  void name() {
        int n,j=1,numper=0,i=1;
        n=tec.leer(0, "Ingrese el rango:");

        while (i<=n) {
            while (j<i) {
                if (i %j==0) {

                    numper=numper+j;
                    
                }


                j++;

            }
            i++;
        }
        if (i==numper) {
            System.out.println(i);
            
        } 
    }
    

    public  void Ejercicio5() {

        System.out.println("---------------->Ejercicio5<----------------");

        //variables, datos de entrada y proceso

        int b=tec.leer(0, "Ingresa la base:");
        int e=tec.leer(0, "Ingresa el exponente:");
        //salida

        System.out.println(b+" elevado a la"+e+"es igual a: "+potencia(b,e));
    
    }


    public double potencia(int base, int exponente){
        //condicion de potencia elevadoa la 0
        if (exponente==0) {
            return 1;
        //normal
        }else{
            return base*potencia(base, exponente-1);
        }
    }
}
