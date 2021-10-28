
package Control;

import Modelo.Pais;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class Lista_Pais {
    
    private Nodo_Pais Inicio,Fin;
    
    public Lista_Pais() {
        Inicio = Fin = null;
    }

    public Nodo_Pais getInicio() {
        return Inicio;
    }

    public void setInicio(Nodo_Pais Inicio) {
        this.Inicio = Inicio;
    }

    public Nodo_Pais getFin() {
        return Fin;
    }

    public void setFin(Nodo_Pais Fin) {
        this.Fin = Fin;
    }
    
  public void Agregar_Fin(Pais Elemento){
        Nodo_Pais Nuevo = new Nodo_Pais(Elemento);
        if (Inicio == null) {
            Inicio = Fin = Nuevo;
        }else{
        Fin.setSiguiente(Nuevo);
        Nuevo.setAnterior(Fin);
        Fin = Nuevo;
        }

    } 
  public void Listar(DefaultTableModel modtabla){
        modtabla.setRowCount(0);
        Nodo_Pais Auxiliar = Fin; 
        if(Auxiliar != null){
            do{
        modtabla.addRow(Auxiliar.getElemento().getRegistro());
        Auxiliar= Auxiliar.getSiguiente();
            }while(Auxiliar != Inicio);
        }
    }
   public void Eliminar_Nodo(Nodo_Pais Auxiliar){
        if(Auxiliar== Inicio){
            Inicio= Inicio.getSiguiente();  
        }else{
            Nodo_Pais Actual = Inicio;
            while(Actual.getSiguiente() !=Auxiliar){
                Actual=Actual.getSiguiente();
            }
            if(Auxiliar== Fin){
                Actual.setSiguiente(null);
                Fin = Actual;       
            }else {
                Actual.setSiguiente(Auxiliar.getSiguiente());
            }
        }
    }
   public void Cargar_Pais(JComboBox Combo_Pais){
    DefaultComboBoxModel modcombox=new DefaultComboBoxModel();  
    Combo_Pais.setModel(modcombox);
    Nodo_Pais Auxiliar = Inicio;
    if(Auxiliar != null){
            do{
        modcombox.addElement(Auxiliar.getElemento().getNombre());
        Auxiliar= Auxiliar.getSiguiente();
            }while(Auxiliar != Inicio);
        }
   }
   
   
}
