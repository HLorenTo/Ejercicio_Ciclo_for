/*
Desarrollar un programa que permita definir si un número entero ya 
establecido es un número perfecto o no.
 */
package ejerciciociclofor;
public class Ejercicio3 {
public static void main(String[] args) {
int numero = 28;
int a = 0;
for (int i = 1; i < numero; i++)
{
    if(numero%i == 0){
    a = i+a;
    }
}
    if (a == numero){
        System.out.println(a + " ES UN NUMERO PERFECTO");
    }
    else{
        System.out.println(a + " No es un numero perfecto");
    }
    }
}


