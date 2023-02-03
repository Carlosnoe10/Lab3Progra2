package lab3progra2_carlosnoe;

public class Vehiculo {

    protected String Color;
    protected String Modelo;
    protected int anioFab;
    protected int precio;
    protected int CantidadDLlantas;

    public Vehiculo() {
    }

    public Vehiculo(String Color, String Modelo, int anioFab, int precio, int CantidadDLlantas) {
        this.Color = Color;
        this.Modelo = Modelo;
        this.anioFab = anioFab;
        this.precio = precio;
        this.CantidadDLlantas = CantidadDLlantas;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(int anioFab) {
        this.anioFab = anioFab;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadDLlantas() {
        return CantidadDLlantas;
    }

    public void setCantidadDLlantas(int CantidadDLlantas) {
        this.CantidadDLlantas = CantidadDLlantas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "Color=" + Color + ", Modelo=" + Modelo + ", anioFab=" + anioFab + ", precio=" + precio + ", CantidadDLlantas=" + CantidadDLlantas + '}';
    }

}
