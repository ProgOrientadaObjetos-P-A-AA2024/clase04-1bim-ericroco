/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;


public class Computadora1 {
    private String tipoProcesador;
    private double memoria;
    
    
    public Computadora1(double m){
        memoria = m;
                
    }
    
    public Computadora1(String tipo ){
        tipoProcesador = tipo;
                
    }

    public Computadora1(String tipo, double mem ){
        memoria = mem;
        tipoProcesador = tipo;
                
    }
    
    
    // métodos establecer para cada atributo
    public void establecerTipoProcesador(String n){
        tipoProcesador = n;
    }
    
    public void establecerMemoria(double n){
        memoria = n;
    }
    
    public String obtenerTipoProcesador(){
        return tipoProcesador;
    }
    
    public double obtenerMemoria(){
        return memoria;
    }
    
}
