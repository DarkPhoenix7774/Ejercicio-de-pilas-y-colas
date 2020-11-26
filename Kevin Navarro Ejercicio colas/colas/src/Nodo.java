public class Nodo {

private Object dato;

private Nodo Siguiente;


    public Nodo(Object dato, Nodo siguiente) {


        this.setDato(dato);


          setSiguiente(siguiente);
    }

    public Object getDato() {
        return dato;
    }


    public void setDato(Object dato) {
        this.dato = dato;
    }


    public Nodo getSiguiente() {
        return Siguiente;
    }


    public void setSiguiente(Nodo siguiente) {
        Siguiente = siguiente;
    }
}
