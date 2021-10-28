
package Modelo;


public class Boleto {
    public int Num_Boleto,Num_Asiento;
    public String Fecha,Hora,Vuelo,Cliente;
    
  public Boleto(Object []Registro){
        Num_Boleto=Integer.parseInt(Registro[0].toString());
        Fecha = Registro[1].toString ();
        Hora = Registro[2].toString ();
        Vuelo = Registro[3].toString ();
        Cliente = Registro[4].toString ();
        Num_Asiento=Integer.parseInt(Registro[5].toString());
    }
  public Object[] getRegistro(){
        return new Object[]{Num_Boleto,Fecha,Hora,Vuelo,Cliente,Num_Asiento};
    } 

    public int getNum_Boleto() {
        return Num_Boleto;
    }

    public void setNum_Boleto(int Num_Boleto) {
        this.Num_Boleto = Num_Boleto;
    }

    public int getNum_Asiento() {
        return Num_Asiento;
    }

    public void setNum_Asiento(int Num_Asiento) {
        this.Num_Asiento = Num_Asiento;
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

    public String getVuelo() {
        return Vuelo;
    }

    public void setVuelo(String Vuelo) {
        this.Vuelo = Vuelo;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }
  
}
