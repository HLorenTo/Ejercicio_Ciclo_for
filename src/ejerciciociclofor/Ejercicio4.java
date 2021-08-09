/*
 Desarrollar un programa que realice la sumatoria de todas las 
iteraciones de un ciclo desde 0 hasta un número entero definido 
previamente, al resultado de la suma realizar las siguientes 
operaciones.
- Raíz cuadrada.
- Generar un número aleatorio entre 1 y la sumatoria de las iteraciones.
- Determinar los divisores.
- Hallar la factorial.
- Definir si es un número perfecto.
 */
package ejerciciociclofor;
public class Ejercicio4 {
public static void main(String[] args) {
int entero = 6;
int entero1 = entero;
int aux = 0;
int factorial = 1;
int aux2 = 0;
    for (int i = 0; i <= entero; i++)
        {
            aux = aux+i;
        }
            System.out.println("iteraciones " +aux);
        
    double raiz = Math.sqrt(aux);
    System.out.println("La Raiz de " + aux +" es " + raiz);
    int aleatorio = (int) (Math.random()*aux);
    System.out.println("El aleatorio de " + aux +" es " +aleatorio);
    for (int i = 1; i < entero; i++)
        {
            if (entero%i==0)
                {
                    System.out.println("Un divisor de "+ entero + " es " +i);
                }
        }
    for (int i = entero; i > 0; i--, entero--)
        {
            factorial = factorial * i;
        }
    System.out.println("Factorial: " +factorial);
    
    for (int i = 1; i < entero1; i++)
        {
            if(entero1%i == 0)
                {
                    aux2 = i+aux2;
                }
        }
            if (aux2 == entero1)
            {
                System.out.println(aux2 + " ES UN NUMERO PERFECTO");
            }
            else
            {
                System.out.println(aux2 + " No es un numero perfecto");
            }
        }
    
    
                                        }
                        


    