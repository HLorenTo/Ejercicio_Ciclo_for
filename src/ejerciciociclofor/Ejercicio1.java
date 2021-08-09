/*
 Desarrolla un programa que permita mostrar el factorial de un número 
definido previamente. 
 */
package ejerciciociclofor;
public class Ejercicio1 {
public static void main(String[] args) {    
    int numero = 14;
    int factorial = 1;
    for (int i = numero; i >0; i--, numero--)
    {
        factorial = numero * factorial;
    }
    System.out.println(factorial);
}
}
