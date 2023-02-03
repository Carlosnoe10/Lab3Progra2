
package lab3progra2_carlosnoe;

import java.util.ArrayList;


public class Concesionario {
    protected String Nombremp;
    protected String IDEmpresa;
    protected String Direccion;
    protected ArrayList<Vehiculo>VehiculosVenta= new ArrayList();
    protected ArrayList<Clientes>Personas = new ArrayList();
    protected int Presupuesto;

    public Concesionario() {
    }

    public Concesionario(String Nombremp, String IDEmpresa, String Direccion, int Presupuesto) {
        Vehiculo Car=new Vehiculo();
        VehiculosVenta.add(Car = new Vehiculo());
        this.Nombremp = Nombremp;
        this.IDEmpresa = IDEmpresa;
        this.Direccion = Direccion;
        this.Presupuesto = Presupuesto;
    }

    public String getNombremp() {
        return Nombremp;
    }

    public void setNombremp(String Nombremp) {
        this.Nombremp = Nombremp;
    }

    public String getIDEmpresa() {
        return IDEmpresa;
    }

    public void setIDEmpresa(String IDEmpresa) {
        this.IDEmpresa = IDEmpresa;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<Vehiculo> getVehiculosVenta() {
        return VehiculosVenta;
    }

    public void setVehiculosVenta(ArrayList<Vehiculo> VehiculosVenta) {
        this.VehiculosVenta = VehiculosVenta;
    }

    public ArrayList<Clientes> getPersonas() {
        return Personas;
    }

    public void setPersonas(ArrayList<Clientes> Personas) {
        this.Personas = Personas;
    }

    public int getPresupuesto() {
        return Presupuesto;
    }

    public void setPresupuesto(int Presupuesto) {
        this.Presupuesto = Presupuesto;
    }

    @Override
    public String toString() {
        return "Concesionario{" + "Nombremp=" + Nombremp + ", IDEmpresa=" + IDEmpresa + ", Direccion=" + Direccion + ", VehiculosVenta=" + VehiculosVenta + ", Personas=" + Personas + ", Presupuesto=" + Presupuesto + '}';
    }
    
    
}
