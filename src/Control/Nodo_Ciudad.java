
package Control;

import Modelo.Ciudad;

public class Nodo_Ciudad {
    private Ciudad Elemento;
    private Nodo_Ciudad Siguiente,Anterior;

    public Nodo_Ciudad(Ciudad Elemento) {
        this.Elemento = Elemento;
        Siguiente = Anterior = null;
    }
    
    public Ciudad getElemento() {
        return Elemento;
    }

    public void setElemento(Ciudad Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_Ciudad getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo_Ciudad Siguiente) {
        this.Siguiente = Siguiente;
    }

    public Nodo_Ciudad getAnterior() {
        return Anterior;
    }

    public void setAnterior(Nodo_Ciudad Anterior) {
        this.Anterior = Anterior;
    }

   
    
}
