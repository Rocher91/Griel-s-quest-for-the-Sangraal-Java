/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obstaculos;

import itemspoderes.AbrePuertas;
import proyecto_entrega2.Obstaculo;
import proyecto_entrega2.Jugador;
import proyecto_entrega2.Const;
import proyecto_entrega2.Celda;

/**
 *
 * @author xavi
 */
public class Puerta extends Obstaculo {
    
    public Puerta(){}
    
    /**
     *
     * @return
     */
    @Override
    public String getArchivoImagen(){
        
       return Const.ARCHIVO_PUERTA;  
    }
    
    @Override
    public boolean puedePasar(Jugador jugador){
        return (jugador.getItem()!=null && jugador.getItem().tienePoder(AbrePuertas.INSTANCIA));
    }
    
    @Override
    public boolean pasa(Jugador j,Celda c){
        
         super.pasa(j,c);
         return true;
        
    }
    
}
