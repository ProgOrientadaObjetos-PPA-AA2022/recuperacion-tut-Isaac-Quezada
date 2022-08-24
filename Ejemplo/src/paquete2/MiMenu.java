/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Matias Quezada
 */
public abstract class MiMenu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;
    
    public MiMenu(String m, double inicial) {
        nombrePlato = m;
        valorInicial = inicial;
    }
    
    public void establecerNombrePlato(String n){
        nombrePlato = n;
    }
    
    public void establecerValorInicial(double vi){
        valorInicial = vi;
    }
    
    public abstract void establecerValorMenu();
    
    public String obtenerNombrePlato(){
        return nombrePlato;
    }
    
    public double obtenerValorInicial(){
        return valorInicial;
    }
    
    public double obtenerValorMenu(){
        return valorMenu;
    }
    
}
