public class Punto2 {
    public void P2(int d) {
        Metodos m = new Metodos();
        Producto[][] M = new Producto[d][d];
        M = m.llenarMatriz(d);
        m.mostrarMatriz(M);
        System.out.println("La suma de las cantidades de los productos es: " + m.sumarCantidad(M));
    }
}
