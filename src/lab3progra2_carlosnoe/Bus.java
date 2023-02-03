package lab3progra2_carlosnoe;

public class Bus extends Vehiculo {

    protected int CantidadPasajeros;
    protected String TipoDBus;

    public Bus() {
    }

    public Bus(int CantidadPasajeros, String Color, String Modelo, int anioFab, int precio, int CantidadDLlantas) {
        super(Color, Modelo, anioFab, precio, CantidadDLlantas);
        this.CantidadPasajeros = CantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return CantidadPasajeros;
    }

    public void setCantidadPasajeros(int CantidadPasajeros) {
        String TipoDBus = " ";
        if (CantidadPasajeros > 60) {
            TipoDBus += "Rapidito";
            setTipoDBus(TipoDBus);

        } else {
            TipoDBus += "De ruta";
            setTipoDBus(TipoDBus);
        }
        this.CantidadPasajeros = CantidadPasajeros;
    }

    public String getTipoDBus() {
        return TipoDBus;
    }

    public void setTipoDBus(String TipoDBus) {
        this.TipoDBus = TipoDBus;
    }

    @Override
    public String toString() {
        return super.toString() + "Bus{" + "CantidadPasajeros=" + CantidadPasajeros + ", TipoDBus=" + TipoDBus + '}';
    }

}
