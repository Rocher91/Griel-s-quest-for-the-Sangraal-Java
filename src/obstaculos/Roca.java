/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obstaculos;

import itemspoderes.Rompedor;
import proyecto_entrega2.Obstaculo;
import proyecto_entrega2.Jugador;
import proyecto_entrega2.Const;

/**
 *
 * @author xavi
 */
public class Roca extends Obstaculo {
    
    public Roca(){}
    
    @Override
    public String getArchivoImagen(){
        
       return Const.ARCHIVO_ROCA;  
    }
    
    @Override
    public boolean puedePasar(Jugador jugador){
        
         return(jugador.getItem()!=null && jugador.getItem().tienePoder(Rompedor.INSTANCIA));
    }
}
