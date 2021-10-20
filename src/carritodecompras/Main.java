package carritodecompras;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto(01, "Papas fritas");
        Producto p2 = new Producto(02, "Gaseosa");
        Producto p3 = new Producto(03, "Atun");
        Producto p4 = new Producto(04, "Leche");
        Producto p5 = new Producto(05, "Papel higenico");

        Map<Producto, Integer> carritoCompras = new TreeMap<>();
        carritoCompras.put(p1, 100);
        carritoCompras.put(p2, 200);
        carritoCompras.put(p3, 130);
        carritoCompras.put(p4, 70);
        carritoCompras.put(p5, 150);
        System.out.println(carritoCompras);

        Map<Producto, Integer> carritoCompras2 = new TreeMap<>(new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        carritoCompras2.put(p1, 100);
        carritoCompras2.put(p2, 200);
        carritoCompras2.put(p3, 130);
        carritoCompras2.put(p4, 70);
        carritoCompras2.put(p5, 150);
        System.out.println(carritoCompras2);

    }
}
