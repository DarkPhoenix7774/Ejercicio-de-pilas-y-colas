public class Pila {


    private static Nodo primero;


    public Pila(){


        primero = null;



    }

    public static boolean estaVacia(){


        return primero == null;


    }

    //metodo insertar
    public static void insertar(Object dato){


        if (estaVacia()){

            Nodo nuevo = new Nodo(dato, null);

            primero = nuevo;

        }
        else{

            Nodo ultimo = primero;

            while (ultimo.getSiguiente()!=null){


                ultimo = ultimo.getSiguiente();


            }

            Nodo nuevo = new Nodo(dato,null);


            ultimo.setSiguiente(nuevo);




        }




    }

    //metod delate

    public void eliminar(){

        if (!estaVacia()){


           Nodo ultimo = primero;

           Nodo penultimo = null;

           while (ultimo.getSiguiente() != null){

               //iterando

               penultimo = ultimo;

               ultimo = ultimo.getSiguiente();


            }

           penultimo.setSiguiente(null);


        }

    }

    //metod view

    public void mostrar(){

        Nodo temporal = primero;

        while (temporal != null){


            System.out.println(temporal.getDato()+ "     ");

            temporal = temporal.getSiguiente();


        }


        System.out.println();


    }


}
