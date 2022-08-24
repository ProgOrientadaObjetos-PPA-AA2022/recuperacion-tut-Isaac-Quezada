/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class MenuCarta extends MiMenu {

    private double Guarnicion;
    private double Bebida;
    private double porcentajeAdicional;
    private double valorAdicional;
    
    public MenuCarta(String np , double g){
        super(np , g);
    }
    

    public void establecerValorGuarnicion(double n) {
        Guarnicion = n;
    }

    public void establecerValorBebida(double n) {
        Bebida = n;
    }

    public void establecerPorcentajeAdicional(double n) {
        porcentajeAdicional = n;
    }
    
    public void establecerValorAdicional() {
        valorAdicional = (valorInicial * porcentajeAdicional) / 100;
    }
    
    @Override
    public void establecerValorMenu(){
        valorMenu = valorInicial + Guarnicion + Bebida + porcentajeAdicional;
    }
    
    public double obtenerValorGuarnicion() {
        return Guarnicion;
    }

    public double obtenerValorBebida() {
        return Bebida;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }
    
    public double ObtenerAdicional(){
        return valorAdicional;
    }
    
    @Override
    public String toString() {
        String valor = String.format("Menu a la carta: \n%s\n%.2f\n" ,
                nombrePlato , valorMenu);
        
        return valor;
    }
    
}
