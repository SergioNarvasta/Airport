
package Control;

import Modelo.Boleto;

public class Nodo_Boleto {
    private Boleto Elemento;
    private Nodo_Boleto Siguiente,Anterior;

    public Nodo_Boleto(Boleto Elemento) {
        this.Elemento = Elemento;
        Siguiente = Anterior = null;
    }

    public Boleto getElemento() {
        return Elemento;
    }

    public void setElemento(Boleto Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_Boleto getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo_Boleto Siguiente) {
        this.Siguiente = Siguiente;
    }

    public Nodo_Boleto getAnterior() {
        return Anterior;
    }

    public void setAnterior(Nodo_Boleto Anterior) {
        this.Anterior = Anterior;
    }

   
    
}
