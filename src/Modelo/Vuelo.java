
package Modelo;

public class Vuelo {
    public String Fecha,Hora,Pais,Ciudad;
    public double Precio;
    public int Capacidad;

  public Vuelo(Object []Registro){
        Fecha = Registro[0].toString ();
        Hora = Registro[1].toString ();
        Pais = Registro[2].toString ();
        Ciudad = Registro[3].toString ();
        Precio = Double.parseDouble(Registro[4].toString ());
        Capacidad = Integer.parseInt(Registro[5].toString());
    }
  public Object[] getRegistro(){
        return new Object[]{Fecha,Hora,Pais,Ciudad,Precio,Capacidad};
    } 

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }
  
}
