
package Control;
import Modelo.Pais;

public class Nodo_Pais {
    public Pais Elemento;
    public Nodo_Pais Siguiente,Anterior;

    public Nodo_Pais(Pais Elemento) {
        this.Elemento = Elemento;
        Siguiente = Anterior = null;
    }

    public Pais getElemento() {
        return Elemento;
    }

    public void setElemento(Pais Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_Pais getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo_Pais Siguiente) {
        this.Siguiente = Siguiente;
    }

    public Nodo_Pais getAnterior() {
        return Anterior;
    }

    public void setAnterior(Nodo_Pais Anterior) {
        this.Anterior = Anterior;
    }
    
    
    
    
}
