/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3progra2_carlosnoe;

public class CamionDCarga extends Vehiculo{
        protected int MaximoDeCarga;
        protected boolean Elmiuwu;

    public CamionDCarga() {
    }

    public CamionDCarga(int MaximoDeCarga, boolean Elmiuwu, String Color, String Modelo, int anioFab, int precio, int CantidadDLlantas) {
        super(Color, Modelo, anioFab, precio, CantidadDLlantas);
        this.MaximoDeCarga = MaximoDeCarga;
        this.Elmiuwu = Elmiuwu;
    }

    public int getMaximoDeCarga() {
        return MaximoDeCarga;
    }

    public void setMaximoDeCarga(int MaximoDeCarga) {
        this.MaximoDeCarga = MaximoDeCarga;
    }

    public boolean isElmiuwu() {
        return Elmiuwu;
    }
//(true si tiene)(false no tiene)
    public void setElmiuwu(boolean Elmiuwu) {
        this.Elmiuwu = Elmiuwu;
    }

    @Override
    public String toString() {
        return super.toString()+" CamionDCarga{" + "MaximoDeCarga=" + MaximoDeCarga + ", Elmiuwu=" + Elmiuwu + '}';
    }
    
        
}
