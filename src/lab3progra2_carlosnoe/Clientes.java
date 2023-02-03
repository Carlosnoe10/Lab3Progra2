
package lab3progra2_carlosnoe;

import java.util.ArrayList;


public class Clientes {
protected String IDunique;
protected String Nombre;
protected ArrayList<Vehiculo>VehiculosPro= new ArrayList();
protected int Billetera;

    public Clientes() {
    }

    public Clientes(String IDunique, String Nombre, int Billetera) {
        this.IDunique = IDunique;
        this.Nombre = Nombre;
        this.Billetera = Billetera;
    }

    public String getIDunique() {
        return IDunique;
    }

    public void setIDunique(String IDunique) {
        this.IDunique = IDunique;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Vehiculo> getVehiculosPro() {
        return VehiculosPro;
    }

    public void setVehiculosPro(ArrayList<Vehiculo> VehiculosPro) {
        this.VehiculosPro = VehiculosPro;
    }

    public int getBilletera() {
        return Billetera;
    }

    public void setBilletera(int Billetera) {
        this.Billetera = Billetera;
    }

    @Override
    public String toString() {
        return "Clientes{" + "IDunique=" + IDunique + ", Nombre=" + Nombre + ", VehiculosPro=" + VehiculosPro + ", Billetera=" + Billetera + '}';
    }


}
