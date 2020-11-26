public class Cola {
    private static Nodo primero;

    public Cola(){


        primero = null;



    }

    public static boolean estaVacia(){


        return primero == null;


    }

    //metod insert
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

    //metodo eliminar

    public void eliminar(){

        if (!estaVacia()){


            primero = primero.getSiguiente();




        }

    }
    public void mostrar(){

        Nodo temporal = primero;

        while (temporal != null){


            System.out.println(temporal.getDato()+ "     ");

            temporal = temporal.getSiguiente();


        }


        System.out.println();


    }


}
