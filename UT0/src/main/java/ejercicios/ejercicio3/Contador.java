package ejercicios.ejercicio3;

public class Contador {
    static final int MAX_CONT = 10;
    int incremento = 1;
    int contador = 0;

    public static void main(String[] args) {
        Contador contador1 = new Contador();

        while (contador1.contador < contador1.MAX_CONT) {
            contador1.contador = contador1.contador + contador1.incremento;
            }
        System.out.println("Contador con While: " + contador1.contador);
        Contador contador2 = new Contador();
        do {
            contador2.contador = contador2.contador + contador2.incremento;
        } while(contador2.contador < MAX_CONT);
        System.out.println("Contador con Do While: " + contador2.contador);

        Contador contador3 = new Contador();
        for (contador3.contador = 0; contador3.contador < MAX_CONT; contador3.contador = contador3.contador + contador3.incremento) {
        }
        System.out.println("Contador con For: " + contador3.contador);

    }


}
