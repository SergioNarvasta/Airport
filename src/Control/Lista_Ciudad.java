
package Control;

import Modelo.Ciudad;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class Lista_Ciudad {
    private Nodo_Ciudad Inicio,Fin;
    int codigo=99951;
    
    public Lista_Ciudad() {
        Inicio= Fin= null;
    }

    public Nodo_Ciudad getInicio() {
        return Inicio;
    }

    public void setInicio(Nodo_Ciudad Inicio) {
        this.Inicio = Inicio;
    }

    public Nodo_Ciudad getFin() {
        return Fin;
    }

    public void setFin(Nodo_Ciudad Fin) {
        this.Fin = Fin;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   public void Agregar_Fin(Ciudad Elemento){
        Nodo_Ciudad Nuevo = new Nodo_Ciudad(Elemento);
        if (Inicio== null) {
            Inicio = Fin = Nuevo;
        }else{
        Fin.setSiguiente(Nuevo);
        Nuevo.setAnterior(Fin);
        Fin = Nuevo;
        }
        Fin.setSiguiente(Inicio);
        Inicio.setAnterior(Fin);
    } 
  public void Listar(DefaultTableModel modtabla){
        modtabla.setRowCount(0);
        Nodo_Ciudad Auxiliar = Inicio;
        
        if(Auxiliar != null){
            do{
        modtabla.addRow(Auxiliar.getElemento().getRegistro());
        Auxiliar= Auxiliar.getSiguiente();
            }while(Auxiliar != Inicio);
        }
    }
   public void Eliminar_Nodo(Nodo_Ciudad Auxiliar){
        if(Auxiliar== Inicio){
            Inicio= Inicio.getSiguiente();  
        }else{
            Nodo_Ciudad Actual = Inicio;
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
       public int Codigo_Ciudad(){
        return codigo++;
    }
    public void Cargar_Ciudad(JComboBox Combo){
    DefaultComboBoxModel modcombox=new DefaultComboBoxModel();  
    Combo.setModel(modcombox);
    Nodo_Ciudad Auxiliar = Inicio;
    if(Auxiliar != null){
            do{
        modcombox.addElement(Auxiliar.getElemento().getNombre());
        Auxiliar= Auxiliar.getSiguiente();
            }while(Auxiliar != Inicio);
        }
   }
       
       
}
