/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obstaculos;

import itemspoderes.ApagaFuegos;
import proyecto_entrega2.*;


/**
 *
 * @author xavi
 */
public class Fuego extends Obstaculo{
    
    public Fuego(){}
  
    @Override
    public String getArchivoImagen(){
        
       return Const.ARCHIVO_FUEGO;  
    }
    
    /**
     *
     * @param jugador
     * @return
     */
    @Override
    public boolean puedePasar(Jugador jugador){

         return (jugador.getItem()!=null && jugador.getItem().tienePoder(ApagaFuegos.INSTANCIA));   
    }
    
}
