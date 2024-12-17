package demos;
/*
 * Cada termino nuevo en la secuencia de Fibonacci se genera sumando los dos terminos anteriores. Comenzando con 1 y 2, la primeros 10 terminos seran:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * Considerando los terminos de la secuencia de Fibonacci cuyos valores no superan los cuatro millones, encuentre la suma de los terminos de valor par.
 */
public class demo002 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int sum;
        int par = 0;
        while (b < 4000000) {
            if (b % 2 == 0) {
                par += b;
                //System.out.println(par);
            }
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println( "La suma de numeros pares de la serie Fibonacci es: " + par);
   }
}