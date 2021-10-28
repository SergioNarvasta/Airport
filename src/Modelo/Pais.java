
package Modelo;

public class Pais {
    public int Codigo;
    public String Nombre;
    
  public Pais(Object []Registro){
        Codigo = Integer.parseInt(Registro[0].toString());
        Nombre = Registro[1].toString();
    }
  public Object[] getRegistro(){
        return new Object[]{Codigo,Nombre};
    } 

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
  
    
}
