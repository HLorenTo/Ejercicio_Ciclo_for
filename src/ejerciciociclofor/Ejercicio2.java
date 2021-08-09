/*
Desarrollar un programa que determine los divisores de un número 
definido previamente
 */
package ejerciciociclofor;
public class Ejercicio2 {
public static void main(String[] args) {
    int numeroDefinido = 54;
    
    for (int i = 1; i <= numeroDefinido; i++)
        {
         if (numeroDefinido % i == 0){
             
    System.out.println(i + " ");
}    
}
}
}