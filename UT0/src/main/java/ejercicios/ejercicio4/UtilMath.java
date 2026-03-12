package  ejercicios.ejercicio4;

public class UtilMath {
    public static int factorial(int num) {
        // Caso borde: número negativo
        if (num < 0) {
            System.out.println ("Número negativo");
            return 0;
        }
        int resultado = 1;

        // Multiplica todos los números desde 1 hasta num
        for (int i = 1; i <= num; i++) {
            resultado = resultado * i;
        }

        return resultado;
    }

    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }

        int i = 1;
        int divisores = 0;

        while (i <= n) {
            if (n % i == 0) {
                divisores++;
            }
            i++;
        }

        return divisores == 2;
    }

}