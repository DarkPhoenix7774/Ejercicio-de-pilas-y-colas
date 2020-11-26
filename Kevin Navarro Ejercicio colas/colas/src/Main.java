public class Main {

    public static void main(String[] args) {

        Cola cola = new Cola();

        System.out.println(cola.estaVacia());

        for (int i = 1; i <= 5; i++) {

            cola.insertar(i);

        }

        //encolado los elementos

        System.out.println("MOSTRANDO NUMEROS DE LA COLA: "); cola.mostrar();

        System.out.println("ELIMINANDO NUMEROS DE LA COLA:");
        
        cola.eliminar();

        cola.eliminar();

        cola.mostrar();

    }

}
