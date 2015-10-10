/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

/**
 *
 * @author Sebastian
 */
public class Circuito {
    private int voltaje;
    private float intensidad;
    private float resistencia;
    
    public Circuito(){
        //Constructor
    }
    /*
    * Recibo el voltaje de voltSpinner y lo almaceno en
    * el voltaje del circuito.
    */
    public void setVoltaje(int voltSpinner){
        this.voltaje = voltSpinner;
    }
    public void setIntensidad(int potencia){
        this.intensidad =  potencia /(float) this.voltaje;
    }
    public void setResistencia(){
        this.resistencia = this.voltaje /(float) this.intensidad;
    }
    
    public float getIntensidad(){
        return this.intensidad;
    }
    public float getResistencia(){
        return this.resistencia;
    }
    
}
