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
public abstract class Obstaculo implements ObjetoEnEscena {
    
    @Override
    public boolean pasa(Jugador j,Celda c){
       
        j.setItem(null);
        c.eliminaObjeto();
        return false;
    }
   
}
