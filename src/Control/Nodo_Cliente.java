
package Control;

import Modelo.Cliente;
        
public class Nodo_Cliente {
     private Cliente Elemento;
    private Nodo_Cliente Siguiente,Anterior;

    public Nodo_Cliente(Cliente Elemento) {
        this.Elemento = Elemento;
        Siguiente = Anterior = null;
    }

    public Cliente getElemento() {
        return Elemento;
    }

    public void setElemento(Cliente Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_Cliente getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo_Cliente Siguiente) {
        this.Siguiente = Siguiente;
    }

    public Nodo_Cliente getAnterior() {
        return Anterior;
    }

    public void setAnterior(Nodo_Cliente Anterior) {
        this.Anterior = Anterior;
    }

    
    
}
