
package Control;

import Modelo.Boleto;
import javax.swing.table.DefaultTableModel;

public class Pila_Boleto {
    private Nodo_Boleto Inicio, Fin;

    public Pila_Boleto() {
        Inicio=Fin;
    }

    public Nodo_Boleto getInicio() {
        return Inicio;
    }

    public void setInicio(Nodo_Boleto Inicio) {
        this.Inicio = Inicio;
    }

    public Nodo_Boleto getFin() {
        return Fin;
    }

    public void setFin(Nodo_Boleto Fin) {
        this.Fin = Fin;
    }
    
     public void Apilar(Boleto Elemento){
        Nodo_Boleto Nuevo = new Nodo_Boleto(Elemento);
        if(Inicio == null){
            Inicio = Fin= Nuevo;
        }else{
            Nuevo.setSiguiente(Inicio);
            Inicio = Nuevo;
        }
    }
    public boolean PilaVacia(){
        if(Inicio == null){
            return true;
        }else{
            return false;
        }
    }
    public Boleto Desapilar(){
        if(PilaVacia()){
            return null;
        }else{
            Boleto Elemento = Inicio.getElemento();
            Inicio = Inicio.getSiguiente();
            return Elemento;
        }
    }
    public void Listar(DefaultTableModel modtabla){
        modtabla.setRowCount(0);
        Nodo_Boleto Auxiliar = Inicio;
        
        if(Auxiliar != null){
            do{
        modtabla.addRow(Auxiliar.getElemento().getRegistro());
        Auxiliar= Auxiliar.getSiguiente();
            }while(Auxiliar != Inicio);
        }
    }
}
