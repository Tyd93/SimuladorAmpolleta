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
public class Ampolleta {
    private int potencia;
    private float resistencia;
    private float intensidad;
    
   public Ampolleta(){
       //Constructor
   }
   /*
   * Recibo la potencia desde el Spinner
   * y la asigno como entero a la potencia
   * de la ampolleta.
   */
   
   public void setPotencia(int wattSpinner){
       this.potencia = wattSpinner;
   }
   
   public void setResistencia(float resisCircuito){
       this.resistencia = resisCircuito;
   }
   
   public void setIntensidad(float inteCircuito){
       this.intensidad = inteCircuito;
   }
   
   public int getPotencia(){
       return this.potencia;
   }
   public float getResistencia(){
       return this.resistencia;
   }
   public float getIntensidad(){
       return this.intensidad;
   }
}
