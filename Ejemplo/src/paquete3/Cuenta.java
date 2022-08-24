/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.util.ArrayList;
import paquete2.MiMenu;

/**
 *
 * @author reroes
 */
public class Cuenta {
    protected String nombreCliente;
    protected ArrayList<MiMenu> menus;
    protected double subtotal;
    protected double ivaPorcentaje;
    protected double valorCancelar;
    protected double ivaDolares;
    
    
    
    public void EstablerNombreCliente(String n){
        nombreCliente = n;
    }
    
    public String obtenerNombreCliente(){
        return nombreCliente;
    }

    public void establecerMenus(ArrayList<MiMenu> g){
        menus = g;
    }
    
    public ArrayList<MiMenu> obtenerMenus(){
        return menus;
    }
    
    public void establecerSubTotal(){
        double suma = 0;
        for (int i = 0; i < menus.size(); i++) {
            suma = suma + menus.get(i).obtenerValorMenu();
        }
        subtotal = suma;
    }
    
    public double obtenerSubtotal() {
        return subtotal;
    }
    
    public void establecerIvaPorcentaje(double n) {
        ivaPorcentaje = n;
    }
    
    public void establecerIvaDolares() {
        ivaDolares = (subtotal * ivaPorcentaje) / 100;
    }
    
    public double obtenerIvaPorcentaje(){
        return ivaPorcentaje;
    }
    
    public double obtenerIvaDolares(){
        return ivaDolares;
    }
    
    public void establecerValorCancelar(){
        valorCancelar = subtotal + ivaDolares;
    }
    
    public double obtenerValorCancelar(){
        return valorCancelar;
    }
    
    @Override
    public String toString() {
        String valor = String.format("Nombre Cliente: %s\n"
                + "Subtotal: %.2f\n"
                + "Valor Cancelar: %.2f\n",
                obtenerNombreCliente(),
                obtenerSubtotal(),
                obtenerValorCancelar());
        return valor;
    } 
    
}
