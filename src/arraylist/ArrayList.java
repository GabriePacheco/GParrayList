/*
Siguiendo todos los pasos para resolver un problema mediante el uso del computador 
y el lenguaje de programación Java, realizar lo siguiente:
1.- Crear una estructura tipo ArrayList para almacenar números enteros
2.- Agregue 20 elementos a la lista suministrados por el teclado
3.- Muestre el contenido de la lista mediante un bucle for_each
4.- Elimine de la lista los números pares
5.- Muestre nuevamente el contenido de la lista mediante la interface Iterator
 */
package arraylist;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author gpacheco
 */
public class ArrayList {

    
    public static void main(String[] args) {
        
       java.util.ArrayList<Integer> numeros = new java.util.ArrayList(); // Crear el Array 
       java.util.ArrayList<Integer> pares = new java.util.ArrayList(); // arrar para almacenar los pares 
       Scanner leer = new Scanner(System.in);// para leer elemntos del teclado 
       
       //Leer por tecldo los 20 elementos 
       System.out.println("** Agregar 20 elementos a la lista **");
       for (int i = 0 ; i < 20; i++){
           System.out.print("Ingrese el " + (i + 1) +  " numero: " );//mostrar mensaje de numero ingredado
           numeros.add(leer.nextInt());     
       }
        System.out.print("\n" );
        
       //Mostrar el contenido de la lista
        System.out.print("Lista Numeros \n");
       for(Integer item : numeros){    
           System.out.print("       " +item);
       }
       System.out.print("\n" );
       
       //Eliminar de la lista los numeros pares
       for (Integer item2 : numeros){
           if (item2 % 2 == 0){//Comprabando si es par 
             pares.add(item2);//Almacenamos el numero en el arayy pares  
           }
       }
      
       for(Integer par : pares ){        
          numeros.remove(par);//Elinando el par del array dodnde Numeros
       }
       //Imprimir iterador
        System.out.println("*** Lista de numeros sin pares **");
   
            Iterator it = numeros.iterator();
            while( it.hasNext() ){// Mientreras
              int numero = (Integer) it.next();
              System.out.println(numero);

            }
      
        
    }
    
}
