
package Control;

import Modelo.Cliente;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class Lista_Cliente {
    private Nodo_Cliente Inicio,Fin;
    int codigo=55944;
    
     public Lista_Cliente() {
        Inicio= Fin= null;
    }

    public Nodo_Cliente getInicio() {
        return Inicio;
    }

    public void setInicio(Nodo_Cliente Inicio) {
        this.Inicio = Inicio;
    }

    public Nodo_Cliente getFin() {
        return Fin;
    }

    public void setFin(Nodo_Cliente Fin) {
        this.Fin = Fin;
    }

   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
       public void Agregar_Fin(Cliente Elemento){
        Nodo_Cliente Nuevo = new Nodo_Cliente(Elemento);
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
        Nodo_Cliente Auxiliar = Inicio;
        
        if(Auxiliar != null){
            do{
        modtabla.addRow(Auxiliar.getElemento().getRegistro());
        Auxiliar= Auxiliar.getSiguiente();
            }while(Auxiliar != Inicio);
        }
    }
   public void Eliminar_Nodo(Nodo_Cliente Auxiliar){
        if(Auxiliar== Inicio){
            Inicio= Inicio.getSiguiente();  
        }else{
            Nodo_Cliente Actual = Inicio;
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
       public int Codigo_Cliente(){
        return codigo++;
    }
    public void Cargar_Cliente(JComboBox Combo){    
    DefaultComboBoxModel modcombox=new DefaultComboBoxModel();  
    Combo.setModel(modcombox);
    Nodo_Cliente Auxiliar = Inicio;
    if(Auxiliar != null){
            do{
        String Nombre = Auxiliar.getElemento().getNombre();
        String Apellidos = Auxiliar.getElemento().getApellidos();
        modcombox.addElement(Nombre +", "+ Apellidos);
        Auxiliar= Auxiliar.getSiguiente();
            }while(Auxiliar != Inicio);
        }
   }
     
}
