package lab3progra2_carlosnoe;

public class Carro extends Vehiculo{
        protected int CantidadPuertas;
        protected String DescripMotor;
        protected int VelocidadMax;

    public Carro() {
    }

    public Carro(int CantidadPuertas, String DescripMotor, int VelocidadMax, String Color, String Modelo, int anioFab, int precio, int CantidadDLlantas) {
        super(Color, Modelo, anioFab, precio, CantidadDLlantas);
        this.CantidadPuertas = CantidadPuertas;
        this.DescripMotor = DescripMotor;
        this.VelocidadMax = VelocidadMax;
    }

    public int getCantidadPuertas() {
        return CantidadPuertas;
    }

    public void setCantidadPuertas(int CantidadPuertas) {
        this.CantidadPuertas = CantidadPuertas;
    }

    public String getDescripMotor() {
        return DescripMotor;
    }

    public void setDescripMotor(String DescripMotor) {
        this.DescripMotor = DescripMotor;
    }

    public int getVelocidadMax() {
        return VelocidadMax;
    }

    public void setVelocidadMax(int VelocidadMax) {
        this.VelocidadMax = VelocidadMax;
    }

    @Override
    public String toString() {
        return super.toString()+"Carro{" + "CantidadPuertas=" + CantidadPuertas + ", DescripMotor=" + DescripMotor + ", VelocidadMax=" + VelocidadMax + '}';
    }
    
    
        
        
}
