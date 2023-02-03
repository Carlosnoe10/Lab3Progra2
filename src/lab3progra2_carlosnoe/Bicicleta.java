
package lab3progra2_carlosnoe;


public class Bicicleta extends Vehiculo{
    protected String Descripcion;
    protected double RadioRueda;
    protected String tipo;

    public Bicicleta() {
    }


    public Bicicleta(String Descripcion, double RadioRueda, String tipo, String Color, String Modelo, int anioFab, int precio, int CantidadDLlantas) {
        super(Color, Modelo, anioFab, precio, CantidadDLlantas);
        this.Descripcion = Descripcion;
        this.RadioRueda = RadioRueda;
        this.tipo = tipo;
    }

    

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getRadioRueda() {
        return RadioRueda;
    }

    public void setRadioRueda(double RadioRueda) {
        this.RadioRueda = RadioRueda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equalsIgnoreCase("Bmx")) {
        this.tipo = tipo;   
        }else if(tipo.equalsIgnoreCase("De calle")){
        this.tipo = tipo;   
        }
    }

    @Override
    public String toString() {
        return super.toString()+" Bicicleta{" + "Descripcion=" + Descripcion + ", RadioRueda=" + RadioRueda + ", tipo=" + tipo + '}';
    }
    
    
}
