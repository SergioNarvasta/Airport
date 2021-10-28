
package Control;

import Modelo.Vuelo;

public class Nodo_Vuelo {
    private Vuelo Elemento;
    private Nodo_Vuelo Siguiente,Anterior;

    public Nodo_Vuelo(Vuelo Elemento) {
        this.Elemento = Elemento;
        Siguiente = Anterior = null;
    }

    public Vuelo getElemento() {
        return Elemento;
    }

    public void setElemento(Vuelo Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_Vuelo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo_Vuelo Siguiente) {
        this.Siguiente = Siguiente;
    }

    public Nodo_Vuelo getAnterior() {
        return Anterior;
    }

    public void setAnterior(Nodo_Vuelo Anterior) {
        this.Anterior = Anterior;
    }

   
    
}
