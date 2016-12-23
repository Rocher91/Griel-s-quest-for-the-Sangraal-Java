/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_entrega2;

import java.util.HashSet;
import java.util.Set;
import proyecto_entrega2.*;
import proyecto_entrega2.Celda;
import proyecto_entrega2.Jugador;
import proyecto_entrega2.ObjetoEnEscena;
import proyecto_entrega2.PoderItem;

/**
 *
 * @author xavi
 */
public abstract class Item implements ObjetoEnEscena {
    
    protected Set<PoderItem> poderes;
    
    public Item(){
        this.poderes=new HashSet<PoderItem>();
    }

    @Override
   public boolean pasa(Jugador j,Celda c){
       
       j.setItem(this);
       c.eliminaObjeto();
   
       return false; 
   }
   
    @Override
   public boolean puedePasar(Jugador jugador){
       
       return jugador.getItem()==null;    
   }
   
   public boolean tienePoder(PoderItem poder){
       
       return this.poderes.contains(poder);
   }
    
}
