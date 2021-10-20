package palabras;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String oracion2 = "La casa es rosada casa verde casa negra casa verde";
        System.out.println(devolverConjunto(oracion2));
    }

    public static Set<String> devolverConjunto(String oracion) {
        Set<String> miConjunto = new TreeSet<>();
        int contador = 0;
        boolean primerPalabra = true;
        for (int i = 0; i < oracion.length(); i++) {
            char letra = oracion.charAt(i);
            if (letra == ' ') {
                if (primerPalabra) {
                    miConjunto.add(oracion.substring(contador, i));
                    primerPalabra = false;
                } else miConjunto.add(oracion.substring(contador + 1, i));
                contador = i++;
            } else if (i == oracion.length() - 1) {
                miConjunto.add(oracion.substring(++contador, ++i));
            }
        }
        return miConjunto;
    }

    public static Map<String, Integer> devolverConjunto2(String oracion) {
        String[] miarray = oracion.split(" ");
        Map<String, Integer> miConjunto = new TreeMap<>();
        for (String palabra : miarray) {
            if (miConjunto.containsKey(palabra)) {
                miConjunto.put(palabra, miConjunto.get(palabra) + 1);
            } else miConjunto.put(palabra, 1);
        }
        return miConjunto;
    }

    public static Set<String> devolverConjunto3(String oracion) {
        Set<String> miConjunto = new TreeSet<>();
        String[] miarray = oracion.split(" ");
        for (String palabra : miarray) {
            miConjunto.add(palabra);
        }
        return miConjunto;
    }

}