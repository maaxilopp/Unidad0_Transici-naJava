package ejercicios.ejecicio10;
//importamos las colecciones. La necestiamos porque no sabemos el largo del archivo de antemano

import java.util.ArrayList;
import java.util.Scanner; // Liberaria para leer strings



public class ContadorPalabras {
    public String[] obtenerLineas(String archivo) {
        ArrayList<String> lineas = new ArrayList<>();
        Scanner scan = new Scanner(archivo);
        while (scan.hasNextLine()){
            String nuevaLinea = scan.nextLine();
            lineas.add(nuevaLinea);
        }
        scan.close();
        //pasamos de la coleccion al arreglo para poder retornarlo.
        //Creamos el arreglo en base al largo de la coleccion
        int largoColeccion = lineas.size();
        String[] ArrLineas = new  String[largoColeccion];
        for (int i = 0; i < largoColeccion;i++){
            ArrLineas[i] = lineas.get(i);
        }
        return ArrLineas;
    }
    public int CalcularCantPalabrasLinea (String[] arr){
        int contadorPalabras = 0;
        for (int i=0;i<arr.length;i++){
            Scanner scan = new Scanner(arr[i]);
            while (scan.hasNext()) {
                contadorPalabras++; //si existe un palabra cuenta
                scan.next(); //llama a la siguiente palabra
            }
            scan.close();
        }
        return contadorPalabras;
    }
    public ArrayList<String> palabrasComunes(String[] a, String[] b) {
        //Obtenemos el string mas largo.
        //Creamos uno nuevo del mismo largo que es mas pequeñp y recorremos ambos strings insertando
        ArrayList<String> PalabrasEnAmbos = new ArrayList<>();
        if (a.length < b.length){
            int max = a.length;
            for (int i= 0;i<max;i++){
                for (int j = 0;j<b.length;j++){
                    if (a[i].equals(b[j])){
                        PalabrasEnAmbos.add(a[i]);
                    }
                }
            }
        }else {
            int max = b.length;
            for (int i= 0;i<max;i++){
                for (int j= 0;j< a.length;j++){
                    if(b[i].equals(a[j])){
                        PalabrasEnAmbos.add(b[i]);
                    }
                }
            }
        }
        return PalabrasEnAmbos;
    }

}
