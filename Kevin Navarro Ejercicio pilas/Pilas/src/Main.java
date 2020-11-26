public class Main {

    public static void main(String[] args) {

        Pila pila = new Pila();

        System.out.println(Pila.estaVacia());

        for (int i = 1; i <= 5; i++) {

            Pila.insertar(i);




        }

        System.out.println("MOSTRANDO LOS PRIMEROS 2 NUMEROS DE LA PILA");  pila.mostrar();

        System.out.println("ELIMINANDO LOS ULTIMOS 3 NUMEROS DE LA PILA");

        pila.eliminar();
        pila.eliminar();
        pila.eliminar();

        System.out.println("VOLVIENDO A MOSTRAR LOS NUMEROS DE LA PILA CON EL METODO ELIMINAR");pila.mostrar();

    }


}
