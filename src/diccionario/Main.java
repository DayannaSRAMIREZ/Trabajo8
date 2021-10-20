package diccionario;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import static palabras.Main.*;
public class Main {
    public static void main(String[] args) {
        Map<String, String> miConjunto = new TreeMap<>();
        miConjunto.put("casa", "Edificio o parte de él que constituye una vivienda particular.");
        miConjunto.put("sucia", "Que tiene polvo, basura, manchas o impurezas.");
        miConjunto.put("la", "Forma del femenino del artículo determinado.");
        miConjunto.put("extraña", "Que es muy distinto de lo habitual, natural o normal y tiene algo de extraordinario o inexplicable que excita la curiosidad, sorpresa o admiración.");
        miConjunto.put("computadora", "Máquina electrónica capaz de almacenar información y tratarla automáticamente mediante operaciones matemáticas y lógicas controladas por programas informáticos.");

        String oracion = "la extraña casa se encontraba sucia";
        imprimirDefiniciones(miConjunto, devolverConjunto3(oracion));

    }

    public static void imprimirDefiniciones(Map<String, String> diccionario, Set<String> conjunto) {
        for (String elemento : conjunto) {
            if (diccionario.containsKey(elemento)) {
                System.out.println(elemento + ": " + diccionario.get(elemento));
            }
        }
    }
}
