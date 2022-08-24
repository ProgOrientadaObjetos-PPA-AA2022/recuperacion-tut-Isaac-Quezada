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
public class MenuDia extends MiMenu {
    
    private double postre;
    private double Bebida;
    
    
    public MenuDia(String np , double g){
        super(np , g);
    }
    

    public void establecerOostre(double n) {
        postre = n;
    }

    public void establecerValorBebida(double n) {
        Bebida = n;
    }
    
    @Override
    public void establecerValorMenu(){
        valorMenu = valorInicial + postre + Bebida ;
    }
    
    public double obtenerPostre() {
        return postre;
    }

    public double obtenerBebida() {
        return Bebida;
    }
    
    @Override
    public String toString() {
        String valor = String.format("Menu del dia: \n%s\n%.2f\n" ,
                nombrePlato , valorMenu);
        
        return valor;
    }
}
