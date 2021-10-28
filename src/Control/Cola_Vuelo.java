
package Control;

import Modelo.Vuelo;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;


public class Cola_Vuelo {
    
    private Nodo_Vuelo Inicio, Fin;
    
    public Cola_Vuelo(){
        Inicio = Fin = null;   
    }

    public Nodo_Vuelo getInicio() {
        return Inicio;
    }

    public void setInicio(Nodo_Vuelo Inicio) {
        this.Inicio = Inicio;
    }

    public Nodo_Vuelo getFin() {
        return Fin;
    }

    public void setFin(Nodo_Vuelo Fin) {
        this.Fin = Fin;
    }
     public void Encolar(Vuelo Elemento){
         Nodo_Vuelo Nuevo = new Nodo_Vuelo(Elemento);
        if(Inicio == null){
            Inicio = Fin= Nuevo;
        }else{
            Fin.setSiguiente(Nuevo);
            Fin = Nuevo;
        }
    }
    public boolean ColaVacia(){
        if(Inicio == null)
        {
            return true;
        }else
        {
            return false;
        }
    }
    public Vuelo Desencolar(){
        if(ColaVacia())
        {
            return null;
        }
        else
        {
            Vuelo Elemento = Inicio.getElemento();
            Inicio = Inicio.getSiguiente();
            return Elemento;
        }
    }
    public void Listar(DefaultTableModel modtabla){
        modtabla.setRowCount(0);
        Nodo_Vuelo Auxiliar = Inicio;
        
        if(Auxiliar != null){
            do{
        modtabla.addRow(Auxiliar.getElemento().getRegistro());
        Auxiliar= Auxiliar.getSiguiente();
            }while(Auxiliar != Inicio);
        }
    }
    public void Cargar_Vuelo(JComboBox Combo){    
    DefaultComboBoxModel modcombox=new DefaultComboBoxModel();  
    Combo.setModel(modcombox);
    Nodo_Vuelo Auxiliar = Inicio;
    if(Auxiliar != null){
            do{
                String Hora = Auxiliar.getElemento().getHora();
                String Fecha = Auxiliar.getElemento().getFecha();
                String Pais = Auxiliar.getElemento().getPais();
                String Ciudad = Auxiliar.getElemento().getCiudad();
                int contador = 0;
        modcombox.addElement("00"+contador++ +"-"+Ciudad+"-"+ Pais+"-"+Fecha+"-"+Hora);
        Auxiliar= Auxiliar.getSiguiente();
            }while(Auxiliar != Inicio);
        }
   }
    
}
