/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.MenuCarta;
import paquete2.MenuDia;
import paquete2.MiMenu;
import paquete3.Cuenta;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuCarta m1 = new MenuCarta("Fritada" , 3.00);
        m1.establecerValorGuarnicion(1.50);
        m1.establecerValorBebida(2.50);
        m1.establecerPorcentajeAdicional(10);
        m1.establecerValorAdicional();
        m1.establecerValorMenu();
        
        
        MenuDia m2 = new MenuDia("Arroz con Atun", 2.00 );
        m2.establecerOostre(1.00);
        m2.establecerValorBebida(1.50);
        m2.establecerValorMenu();
        
        
        ArrayList<MiMenu> ListaMenus = new ArrayList<>();
        ListaMenus.add(m1);
        ListaMenus.add(m2);
        
        Cuenta c = new Cuenta();
        c.EstablerNombreCliente("Miguel Alvarez");
        c.establecerIvaPorcentaje(20);
        c.establecerMenus(ListaMenus);
        c.establecerSubTotal();
        c.establecerIvaDolares();
        c.establecerValorCancelar();
        
        
        System.out.printf("%s\n" , c);
    }
    
}
