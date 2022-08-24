/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.ArrayList;
import paquete5.Beca;

/**
 *
 * @author Matias Quezada
 */
public class Total {

    protected String nombreAlumno;
    protected ArrayList<Beca> listaBecas;
    protected double subtotal;
    protected double iva;
    protected double valorCancelar;

    public Total(String n, ArrayList<Beca> lista, double m) {
        nombreAlumno = n;
        listaBecas = lista;
        iva = m;
    }

    public void establecerListaCartas(ArrayList<Beca> n) {
        listaBecas = n;
    }

    public void establecerNombreAlumno(String x) {
        nombreAlumno = x;
    }

    public void establecerIva(double n) {
        iva = n;
    }

    public void establecerSubtotal() {
        double suma = 0;
        for (int i = 0; i < listaBecas.size(); i++) {
            suma = suma + listaBecas.get(i).getValorBeca();
        }
        subtotal = suma;
    }

    public void establecerValorCancelar() {
        valorCancelar = (subtotal + (subtotal * (iva / 100)));
    }

    public ArrayList<Beca> obtenerListaCartas() {
        return listaBecas;
    }

    public String obtenerNombreAlumno() {
        return nombreAlumno;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String cadena = String.format("Universidad Tecnica Particular Loja\n"
                + "Alumno: %s\n\n",
                obtenerNombreAlumno());
        for (int i = 0; i < obtenerListaCartas().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    obtenerListaCartas().get(i));

        }
        cadena = String.format("\n%s"
                + "Subtotal: %.2f\n"
                + "Iva: %.2f\n"
                + "Total a pagar: %.2f\n",
                cadena,
                obtenerSubtotal(),
                obtenerIva(),
                obtenerValorCancelar());
        return cadena;
    }
}
