package primos;

import java.util.*;

public class NumerosPrimos {
    private static Map<Integer, Boolean> conjNum = new TreeMap<>();


    public static boolean esPrimo(int numero) {
        boolean primo = true;
        if (conjNum.containsKey(numero)) return conjNum.get(numero);
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        conjNum.put(numero, primo);
        return primo;
    }

    public static Set<Integer> primosConocidos() {
        Set<Integer> primos = new TreeSet<>();
        for (Integer numero:conjNum.keySet()) {
            if(conjNum.get(numero)){
                primos.add(numero);
            }
        }
        return primos;
    }

}