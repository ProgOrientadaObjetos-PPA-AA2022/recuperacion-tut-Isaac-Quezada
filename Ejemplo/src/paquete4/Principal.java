/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import java.util.ArrayList;
import paquete6.Total;
import paquete5.*;
/**
 *
 * @author Matias Quezada
 */
public class Principal {
    
    public static void main(String[] args) {
    
        ArrayList<Beca> b1 = new ArrayList<>();
        
        BecaClub bc = new BecaClub(1200, 15);
        bc.setValorBeca();
        b1.add(bc);
        
        
        BecaDeportiva bd = new BecaDeportiva(1200, 20);
        bd.setValorBeca();
        b1.add(bd);
        
        BecaEconomica be = new BecaEconomica(1200, 30);
        be.setValorBeca();
        b1.add(be);
        
        BecaFamiliar bf = new BecaFamiliar(1200,25);
        bf.setValorBeca();
        b1.add(bf);
        
        Total t = new Total("Isaac Quezada" ,b1 ,12);
        for (int i = 0; i < b1.size(); i++) {
            t.establecerSubtotal();
            t.establecerValorCancelar();
        }
        
        System.out.println(t);
        
    }
}
