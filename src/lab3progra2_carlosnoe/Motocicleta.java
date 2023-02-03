
package lab3progra2_carlosnoe;


public class Motocicleta extends Vehiculo{
    protected int Desplasamiento;

    public Motocicleta() {
    }

    public Motocicleta(int Desplasamiento, String Color, String Modelo, int anioFab, int precio, int CantidadDLlantas) {
        super(Color, Modelo, anioFab, precio, CantidadDLlantas);
        this.Desplasamiento = Desplasamiento;
    }

    public int getDesplasamiento() {
        return Desplasamiento;
    }

    public void setDesplasamiento(int Desplasamiento) {
        this.Desplasamiento = Desplasamiento;
    }

    @Override
    public String toString() {
        return super.toString()+" Motocicleta{" + "Desplasamiento=" + Desplasamiento + '}';
    }
    
}
