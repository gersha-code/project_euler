package demos;
/*  
 * Si enumeramos todos los números naturales menores de 10 que son múltiplos de 3 o 5, obtenemos 3, 5, 6 y 9. 
 * La suma de estos múltiplos es 23. Encuentra la suma de todos los múltiplos de 3 o 5 menores a 1000.
 */
public class demo001 {
    //"Multiplos de 3 o 5"
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 1 || i % 5 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
