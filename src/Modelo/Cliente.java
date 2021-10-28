
package Modelo;


public class Cliente {
    public int Codigo,Telefono;
    public String Nombre,Apellidos,Direccion;
    
  public Cliente(Object []Registro){
        Codigo = Integer.parseInt(Registro[0].toString());
        Nombre = Registro[1].toString();
        Apellidos = Registro[2].toString();
        Direccion = Registro[3].toString();
        Telefono = Integer.parseInt(Registro[4].toString());
    }
  public Object[] getRegistro(){
        return new Object[]{Codigo,Nombre,Apellidos,Direccion,Telefono};
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
  
}
