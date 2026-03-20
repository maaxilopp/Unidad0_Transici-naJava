package ejercicios.ejercicio9;

public class ResultadoAnalisis {
    private int cantidadPalabras;

    public ResultadoAnalisis(int cantidadPalabras) {
        this.cantidadPalabras = cantidadPalabras;
    }

    public int getCantidadPalabras() {
        return cantidadPalabras;
    }

    //Sobreescritura: Reemplaza el método toString() heredado de Object
    @Override
    public String toString() {
        return "Cantidad de palabras: " + cantidadPalabras;
    }

    // Sobrecarga:toString(String) con un parámetro. Mismo nombre "toString" pero diferente parámetro
    public String toString(String formato) {
        if (formato.equalsIgnoreCase("detallado")) {
            return "[DETALLADO] Cantidad de palabras: " + cantidadPalabras;
        }
        return toString(); // Llama a la versión sin parámetros
    }
}

