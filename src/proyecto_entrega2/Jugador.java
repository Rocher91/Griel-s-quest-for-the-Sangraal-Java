/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_entrega2;

/**
 *
 * @author xavi
 */
public class Jugador {
    
    private Celda celda;
    private Item item;
    
    public Jugador(Celda c){
      
        this.celda=c;
    }
    
    public Item getItem(){
        
        return this.item;
    }
    
    public void setItem(Item item){
        
        this.item=item;
    }
    
    public int getPosCol(){
        
        return this.celda.getColumna();
    }
    
    public int getPosFila(){
        
        return this.celda.getFila();
    }
    
    public void setCelda(Celda c){
        this.celda=c;
    }
  
}
