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
public class BecaDeportiva extends Beca{
    private int pBeca;

    public BecaDeportiva(double vim, int vp) {
        super(vim);
        pBeca = vp;
    }

    public void setPorcentajeBeca(int vp) {
        this.pBeca = vp;
    }

    @Override
    public void setValorBeca() {
        valorBeca = (valorBecaInicial - (valorBecaInicial * pBeca) / 100);
    }

    public int getPorcentajeBeca() {
        return pBeca;
    }

    @Override
    public String toString() {
        String cadena = String.format("Beca por Deportiva:\n%s", super.toString());
        cadena = String.format("%s"
                + "Valor porcentaje de la Beca: %s\n"
                + "Valor de la Carrera: %.2f\n", cadena,
                getPorcentajeBeca(),
                getValorBeca());
        return cadena;
    }
}
