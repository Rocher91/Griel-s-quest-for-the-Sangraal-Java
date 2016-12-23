/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obstaculos;

import itemspoderes.AmansaVientos;
import proyecto_entrega2.Const;
import proyecto_entrega2.Jugador;
import proyecto_entrega2.Obstaculo;

/**
 *
 * @author xavi
 */
public class Huracan extends Obstaculo {
    
    public Huracan(){}
    
    @Override
    public String getArchivoImagen(){
        
       return Const.ARCHIVO_HURACAN;  
    }
    
    /**
     *
     * @param jugador
     * @return
     */
    
    @Override
    public boolean puedePasar(Jugador jugador){
      
         return (jugador.getItem()!=null && jugador.getItem().tienePoder(AmansaVientos.INSTANCIA));
    }
    
}
