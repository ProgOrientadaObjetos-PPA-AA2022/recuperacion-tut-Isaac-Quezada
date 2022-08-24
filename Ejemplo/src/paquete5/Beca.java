/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author Matias Quezada
 */
public abstract class Beca {

    
    protected double valorBeca;
    protected double valorBecaInicial;

    public Beca(double vb) {
        valorBecaInicial = vb;
    }

    
    public void setValorBecaInicial(double valorBecaInicial) {
        this.valorBecaInicial = valorBecaInicial;
    }

    public abstract void setValorBeca();

    

    public double getValorBecaInicial() {
        return valorBecaInicial;
    }
    
    public double getValorBeca() {
        return valorBeca;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Valor Inicial de la Carrera: %.2f\n", 
                getValorBecaInicial());
        return cadena;
    }
}
