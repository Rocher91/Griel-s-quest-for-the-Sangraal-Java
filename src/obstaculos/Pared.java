/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obstaculos;

import proyecto_entrega2.Obstaculo;
import proyecto_entrega2.Jugador;
import proyecto_entrega2.Const;

/**
 *
 * @author xavi
 */
public class Pared extends Obstaculo{
    
    public Pared(){}
    
    @Override
    public String getArchivoImagen(){
        
       return Const.ARCHIVO_PARED;  
    }
    
    @Override
    public boolean puedePasar(Jugador jugador){
       
        return false;
    }
}
